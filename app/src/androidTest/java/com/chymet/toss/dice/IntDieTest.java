package com.chymet.toss.dice;

import junit.framework.TestCase;

public class IntDieTest extends TestCase {

    public void setUp() throws Exception { super.setUp(); }

    public void testRoll() throws Exception {
        //tests various dice throws. non-exhaustive due to random generator, but should cover cases
        IntDie d;

        //1d6
        d = new IntDie(1, 6);
        for(int i=0;i<100;i++){
            assertTrue( d.Roll()>=1 && d.Roll()<=6 );
        }

        //3d4
        d = new IntDie(3,4);
        for(int i=0;i<100;i++){
            assertTrue( d.Roll()>=3 && d.Roll()<=12 );
        }

        //56d102
        d = new IntDie(56,102);
        for(int i=0;i<100;i++){
            assertTrue( d.Roll()>=56 && d.Roll()<=5712 );
        }
    }
}