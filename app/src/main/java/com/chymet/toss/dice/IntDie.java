package com.chymet.toss.dice;

import java.util.Random;

/**
 * Created by Kyle on 10/18/2014.
 */
public class IntDie implements Die<Integer> {
    private int n, k;

    public IntDie(int n, int k){
        this.n=n;
        this.k=k;
    }
    public Integer Roll() {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=1+(new Random()).nextInt(k);
        }
        return sum;
    }
}
