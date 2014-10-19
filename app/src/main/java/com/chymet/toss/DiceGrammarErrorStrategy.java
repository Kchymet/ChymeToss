package com.chymet.toss;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;

import org.antlr.v4.runtime.*;

/**
 * Created by Kyle on 10/19/2014.
 */
public class DiceGrammarErrorStrategy extends DefaultErrorStrategy {
    private Activity _context;
    private boolean errorOccurred;
    public DiceGrammarErrorStrategy(Activity c){
        super();
        _context=c;
        errorOccurred=false;
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException re){
        super.reportError(recognizer,re);
        displayErrorMessage("Error on token: "+re.getOffendingToken().getText());
        errorOccurred=true;
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new RecognitionException(recognizer,null,null);
    }

    public boolean getErrorOccurred(){
        return errorOccurred;
    }

    private void displayErrorMessage(String message){
        AlertDialog.Builder b = new AlertDialog.Builder(_context);
        b.setTitle("Error Parsing Dice String!");
        b.setMessage(message);
        b.setCancelable(true);
        b.show();
    }
}
