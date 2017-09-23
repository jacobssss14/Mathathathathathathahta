package io.github.mathrio.matthathathatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameScreen extends AppCompatActivity {

    Button bt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        bt7 = (Button) findViewById(R.id.button7) ;
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pauseScreen = new Intent(GameScreen.this, GameMenu.class);
                startActivity(pauseScreen);
            }
        });




    }
}
