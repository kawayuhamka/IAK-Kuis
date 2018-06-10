package tech.indi.latihaniak3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import tech.indi.latihanlayout.R;

public class MainMenuActivity extends AppCompatActivity {

    Button tentang, quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        tentang = (Button) findViewById(R.id.tombol_tentang);
        quiz = (Button) findViewById(R.id.tombol_quiz);

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenuActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenuActivity.this,QuizActivity.class);
                startActivity(i);
            }
        });



    }
}
