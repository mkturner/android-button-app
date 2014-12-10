package com.geakd.buttonclickcounter;

import android.view.View;

public class CustomOnClickListener implements View.OnClickListener{

    MainActivity caller;

    public CustomOnClickListener(MainActivity activity){
        this.caller = activity;
    }

    public void onClick (View view){
        caller.mainTextView.setText("The button got clicked");
    }
}