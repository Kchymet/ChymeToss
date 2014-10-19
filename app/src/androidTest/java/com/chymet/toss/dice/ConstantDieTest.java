package com.chymet.toss.dice;

import junit.framework.TestCase;

public class ConstantDieTest extends TestCase {

    public void testRoll() throws Exception {
        ConstantDie d = new ConstantDie(1);
        assertEquals(Integer.valueOf(1),d.Roll());
        d = new ConstantDie(2);
        assertEquals(Integer.valueOf(2),d.Roll());
        d = new ConstantDie(5);
        assertEquals(Integer.valueOf(6),d.Roll());
        d = new ConstantDie(5798);
        assertEquals(Integer.valueOf(5798),d.Roll());
    }
}