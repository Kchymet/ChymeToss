package com.chymet.toss.dice;

/**
 * Created by Kyle on 10/19/2014.
 */
public class ConstantDie implements Die<Integer> {
    private int n;
    public ConstantDie(int n){this.n=n;}
    public Integer Roll(){
        return n;
    }
}
