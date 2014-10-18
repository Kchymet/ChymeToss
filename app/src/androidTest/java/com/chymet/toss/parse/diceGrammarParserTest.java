package com.chymet.toss.parse;

import android.content.res.AssetManager;
import android.test.AndroidTestCase;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;

public class diceGrammarParserTest extends AndroidTestCase {
    //private AssetManager assets;
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testInit() throws Exception {
        //tests if assets can be correctly accessed and antlr correctly receives input stream
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest1.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
    }
    public void testCase1() throws Exception {
        //tests a basic ndk die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest1.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        b.expr();
    }
    public void testCase2() throws Exception {
        //tests a set die syntax
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("assets/gtest2.txt");
        diceGrammarLexer a = new diceGrammarLexer(new ANTLRInputStream(input));
        diceGrammarParser b = new diceGrammarParser(new CommonTokenStream(a));
        b.expr();
    }
}