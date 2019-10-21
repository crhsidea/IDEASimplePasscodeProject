package com.idea.ideasimplepasscodeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonClear;
    Button buttonEnter;

    TextView codeDisplay;

    String passcode = "";

    String correctPass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codeDisplay = findViewById(R.id.codeText);

        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        button0 = findViewById(R.id.button_0);
        buttonClear = findViewById(R.id.button_clear);
        buttonEnter = findViewById(R.id.button_enter);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEnter.setOnClickListener(this);
    }

    public void updateText(){
        //set the textView codeDisplay using .setText()
    }

    @Override
    public void onClick(View v) {
        String num = ((Button) v).getText().toString();
        //hint: num is what the text on each button is.
        if(num.equals("C")){
            passcode = "";
        }
        else if(num.equals("ENT")){
            //test out if the passcode typed is equal to the correctPass
            //if it is, create a toast saying that it's correct: Toast.makeText(this, "Password Correct", Toast.LENGTH_SHORT).show();
            //if it isnt, create a toast saying that it's wrong: Toast.makeText(this, "Incorrect, try again", Toast.LENGTH_SHORT).show();
        }
        else if(passcode.length() < 4){
            //add the text from the button the passcode?
        }

        updateText();
    }
}

//bonus functions:
//add a new button that allows the user to set the correctPass
//give the user a limit of how many tries they have to guess the password right
//add a backspace button