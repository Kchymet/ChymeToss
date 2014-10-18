package com.chymet.toss.dice;

import junit.framework.TestCase;

import java.util.List;

public class BinaryDieTest extends TestCase {

    public void testBinaryInt() throws Exception {
        Die d1 = new IntDie(1,7);
        Die d2 = new IntDie(1,7);
        Die main = new BinaryDie(d1,d2);
        Object result = main.Roll();
        assertTrue(result.toString(), result instanceof Integer);
    }
    public void testBinarySet() throws Exception {
        Integer[] i1 = {1,2,3,4,5};
        Integer[] i2 = {6,7,8,9,0};
        List l1 = java.util.Arrays.asList(i1);
        List l2 = java.util.Arrays.asList(i2);
        Die d1 = new SetDie(1,l1);
        Die d2 = new SetDie(1,l2);
        Die main = new BinaryDie(d1,d2);
        Object result = main.Roll();
        assertTrue(result.toString(), result instanceof List);
        assertEquals(2,((List)result).size());
    }
    public void testBinaryMixed() throws Exception {
        Integer[] i2 = {6,7,8,9,0};
        List l2 = java.util.Arrays.asList(i2);
        Die d1 = new IntDie(2,6);
        Die d2 = new SetDie(3,l2);
        Die main = new BinaryDie(d1,d2);
        Object result = main.Roll();
        assertTrue(result.toString(), result instanceof List);
        assertEquals(4,((List)result).size());
    }
}