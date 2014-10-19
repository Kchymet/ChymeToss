package com.chymet.toss;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.chymet.toss.dice.Die;
import com.chymet.toss.parse.diceGrammarBaseListener;
import com.chymet.toss.parse.diceGrammarLexer;
import com.chymet.toss.parse.diceGrammarParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.StringReader;


public class MainActivity extends Activity {
    private diceGrammarBaseListener _listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _listener = new diceGrammarBaseListener();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onButtonClick(View v){
        EditText t = (EditText)this.findViewById(R.id.dice_string);
        String ds = t.getText().toString();
        diceGrammarLexer lex = new diceGrammarLexer(new ANTLRInputStream(ds));
        diceGrammarParser parse = new diceGrammarParser(new CommonTokenStream(lex));
        DiceGrammarErrorStrategy eh = new DiceGrammarErrorStrategy(this);
        parse.setErrorHandler(eh);
        Die die = parse.prgm().d;
        AlertDialog.Builder bld = new AlertDialog.Builder(this);
        if(!eh.getErrorOccurred()){
            bld.setTitle("Dice Roll!");
            bld.setMessage(die.Roll().toString());
            bld.show();
        }
    }
}
