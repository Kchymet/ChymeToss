package com.chymet.toss.dice;

import java.util.List;

/**
 * Created by Kyle on 10/18/2014.
 */
public class BinaryDie implements Die<Object> {
    private Die left, right;

    public BinaryDie(Die d1, Die d2){
        left=d1;
        right=d2;
    }

    public Object Roll() {
        //2 possible types: list or number
        Object o1 = left.Roll();
        Object o2 = right.Roll();
        if(o1 instanceof List && o2 instanceof List){
            ((List<Object>) o1).addAll((List)o2);
            return o1;
        }
        else if(o1 instanceof List){
            ((List<Object>)o1).add(o2);
            return o1;
        }
        else if(o2 instanceof List){
            ((List<Object>)o2).add(o1);
            return o2;
        }
        return (Integer)o1 + (Integer)o2;

    }
}
