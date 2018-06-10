package tech.indi.latihaniak3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tech.indi.latihanlayout.R;

public class HasilActivity extends AppCompatActivity {
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        score = (TextView) findViewById(R.id.text_score);
        score.setText("SCORE : "+String.valueOf( getIntent().getIntExtra("SCORE", 0)));
    }
}
