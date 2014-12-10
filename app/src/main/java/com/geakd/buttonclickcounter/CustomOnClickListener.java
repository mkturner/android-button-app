package com.geakd.buttonclickcounter;

import android.view.View;

public class CustomOnClickListener implements View.OnClickListener{

    MainActivity caller;
    private int count;

    public CustomOnClickListener(MainActivity activity){
        this.caller = activity;
        this.count = 0;
    }

    public void onClick (View view){
        count++;
        //convert int to string
        // String tempResult = integer.toString(count);
        /* don't need to convert, set text is char sequence which
        automatically merges numbers and strings */
        String outputString = "The button has been clicked " + count + " time";

        if (count != 1) {
            outputString += "s";
        }

        caller.mainTextView.setText(outputString);

    }
}