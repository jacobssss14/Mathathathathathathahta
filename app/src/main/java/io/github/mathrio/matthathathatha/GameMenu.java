package io.github.mathrio.matthathathatha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameMenu extends AppCompatActivity {

    Button bt5, bt6, bt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);

        bt5 = (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resumeGame = new Intent(GameMenu.this, GameScreen.class);
                startActivity(resumeGame);
            }
        });

        bt7 = (Button) findViewById(R.id.button7p);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent endGame = new Intent(GameMenu.this, MainMenu.class);
                startActivity(endGame);
            }
        });
    }
}
