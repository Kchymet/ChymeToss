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


prgm returns [Die d]
    : expr EOF { $d=$expr.d; }
    ;

expr returns [Die d]
    @init{
          Die d2 = null;
    }
    : factor ('+' e1=expr {d2=$e1.d;})? {if(null==d2){$d=$factor.d;} else{ $d=new BinaryDie($factor.d,d2);}}
    ;


factor returns [Die d]
    : /*factor_prefix*/ primary {$d=$primary.d;}
    ;

/* currently not implemented, needs LL rewrite
factor_prefix
    : factor_prefix primary MULOP
    | empty
    ;*/

primary returns [Die d]
    : '(' expr ')'  {$d=$expr.d;}
    | intdie        {$d=$intdie.d;}
    | setdie        {$d=$setdie.d;}
    | INTEGER       {$d=new ConstantDie(Integer.valueOf($INTEGER.text));}
    ;

intdie returns [IntDie d]
    : i1=INTEGER 'd' i2=INTEGER {
                           int n = Integer.parseInt($i1.text);
                           int k = Integer.parseInt($i2.text);
                           $d = new IntDie(n,k);
                           }
    ;
setdie returns [SetDie d]
    : i1=INTEGER 'd' s1=set {
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

ADDOP
    : '+'
    ;

/*MULOP
    : '*'
    ;*/


INTEGER
    : [0-9]+
    ;

WHITESPACE
    : ('\t' | '\r' | '\n' | ' ' ) -> skip
    ;

ERROR
    : .
    ;