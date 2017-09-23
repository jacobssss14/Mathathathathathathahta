package io.github.mathrio.matthathathatha;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        bt1 = (Button) findViewById(R.id.button1) ;
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameScreen = new Intent (MainMenu.this, GameScreen.class);
                startActivity(gameScreen);
            }
        });

        bt4 = (Button) findViewById(R.id.button4) ;
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infoScreen = new Intent (MainMenu.this, About.class) ;
                startActivity(infoScreen);
            }
        });
    }


}
