package io.github.mathrio.matthathathatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GameScreen extends AppCompatActivity {


    Button btP, btE, bt0, btD, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    EditText input1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        btP = (Button) findViewById(R.id.button20) ;
        btP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pauseScreen = new Intent(GameScreen.this, GameMenu.class);
                startActivity(pauseScreen);
            }
        });
        input1 = (EditText) findViewById(R.id.editText1);
        btE = (Button) findViewById(R.id.button);
        bt0 = (Button) findViewById(R.id.button8);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(),"0"));
            }
        });
        btD = (Button) findViewById(R.id.button9);
        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().delete(input1.getText().length()-1,input1.getText().length()));
            }
        });
        bt1 = (Button) findViewById(R.id.button10);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "1"));
            }
        });
        bt2 = (Button) findViewById(R.id.button11);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "2"));
            }
        });
        bt3 = (Button) findViewById(R.id.button12);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "3"));
            }
        });
        bt4 = (Button) findViewById(R.id.button14);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "4"));
            }
        });
        bt5 = (Button) findViewById(R.id.button15);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "5"));
            }
        });
        bt6 = (Button) findViewById(R.id.button16);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "6"));
            }
        });
        bt7 = (Button) findViewById(R.id.button17);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "7"));
            }
        });
        bt8 = (Button) findViewById(R.id.button18);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "8"));
            }
        });
        bt9 = (Button) findViewById(R.id.button19);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input1.setText(input1.getText().insert(input1.getText().length(), "9"));
            }
        });





    }
}
