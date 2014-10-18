package com.chymet.toss.dice;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kyle on 10/18/2014.
 */
public class SetDie implements Die<List<Object>> {
    private int n;
    List<Object> items;
    public SetDie(int n, List<Object> a){
        this.n=n; items=a;
    }
    public List<Object> Roll() {
        List<Object> result = new ArrayList<Object>();
        for(int i=0;i<n;i++) {
            result.add(items.get((new Random().nextInt(items.size()))));
        }
        return result;

    }
    public void addItem(Object a){
        items.add(a);
    }
}
