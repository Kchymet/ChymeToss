/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar diceGrammar;

@header{
import com.chymet.toss.dice.*;
import java.util.List;
import java.util.ArrayList;
}

expr returns [Die d]
    : i1=INTEGER 'd' i2=INTEGER {
                           int n = Integer.parseInt($i1.text);
                           int k = Integer.parseInt($i2.text);
                           $d = new IntDie(n,k);
                           }
    | i1=INTEGER 'd' s1=set {
                           int n = Integer.parseInt($i1.text);
                           List<Object> options = $s1.l;
                           $d = new SetDie(n,options);
                           }
    ;

set returns [List<Object> l]
    @init
    {
      $l=new ArrayList<Object>();
    }
    : '{' sc1=setcontents { $l.add($sc1.o); } (',' sc=setcontents {$l.add($sc.o);})* '}'
    ;

setcontents returns [Object o]
    : INTEGER { $o=Integer.valueOf($INTEGER.text); }
    ;

empty
    :
    ;

INTEGER
    : [0-9]+
    ;