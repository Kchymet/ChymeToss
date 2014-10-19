package com.chymet.toss.parse;

import android.content.res.AssetManager;
import android.test.AndroidTestCase;

import com.chymet.toss.dice.BinaryDie;
import com.chymet.toss.dice.ConstantDie;
import com.chymet.toss.dice.Die;
import com.chymet.toss.dice.IntDie;
import com.chymet.toss.dice.SetDie;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;
import java.util.List;

public class diceGrammarParserTest extends AndroidTestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testInit() throws Exception {
        //tests if assets can be correctly accessed and antlr correctly receives input stream
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest1.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
    }
    public void testNdK() throws Exception {
        //tests a basic ndk die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest1.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof IntDie);
    }
    public void testIntSet() throws Exception {
        //tests a set die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest2.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof SetDie);
    }
    public void testStringSet() throws Exception {
        //tests a set die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest8.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof SetDie);
    }
    public void testMixedSet() throws Exception {
        //tests a set die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest9.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof SetDie);
    }
    public void testConst() throws Exception {
        //tests a set die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest6.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof ConstantDie);
    }
    public void testIntAdd() throws Exception {
        //tests input with multiple dies
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest3.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof BinaryDie);
        assertEquals(Integer.valueOf(3), (Integer)d.Roll());
    }
    public void testSetAdd() throws Exception {
        //tests input with multiple dies
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest4.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof BinaryDie);
        assertEquals(14, ((List) d.Roll()).size());
    }
    public void testMixedAdd() throws Exception {
        //tests input with multiple dies
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest5.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        b.addParseListener(new diceGrammarBaseListener());
        Die d = b.prgm().d;
        assertTrue(d.getClass().toString(), d instanceof BinaryDie);
        assertEquals(9, ((List) d.Roll()).size());
    }
}