package com.chymet.toss.dice;

import junit.framework.TestCase;

import java.util.List;

public class SetDieTest extends TestCase {

    public void setUp() throws Exception { super.setUp(); }

    public void testIntRoll() throws Exception {
        SetDie d;
        List<Object> l;

        //1d{1,2,3,4,5}
        Object[] i = {1,2,3,4,5};
        l = java.util.Arrays.asList(i);
        d = new SetDie(1,l);
        for(int j=0;j<100;j++){
            List l2 = d.Roll();
            assertEquals(1,l2.size());
            for(Object o : l2){
                assertTrue(l.contains(o));
            }
        }

        //4d{4,4,4,4,4}
        Object[] i2 = {4,4,4,4,4};
        l = java.util.Arrays.asList(i2);
        d = new SetDie(4,l);
        for(int j=0;j<100;j++){
            List l2 = d.Roll();
            assertEquals(4,l2.size());
            for(Object o : l2){
                assertTrue(l.contains(o));
            }
        }

    }

    public void testAddItem() throws Exception {

    }
}