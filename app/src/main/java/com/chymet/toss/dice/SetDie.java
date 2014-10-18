package com.chymet.toss.dice;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kyle on 10/18/2014.
 */
public class SetDie implements Die<Object> {
    List<Object> items;
    public SetDie(Object a) {
        items = new ArrayList<Object>();
        items.add(a);
    }
    public SetDie(List<Object> a){
        items=a;
    }
    public Object Roll() {
        return items.get((new Random().nextInt(items.size())));
    }
    public void addItem(Object a){
        items.add(a);
    }
}
