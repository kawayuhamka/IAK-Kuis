package tech.indi.latihaniak3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import tech.indi.latihanlayout.R;

public class MainActivity extends AppCompatActivity {

    ImageView banner, profile;
    TextView nama, konten;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banner = (ImageView) findViewById(R.id.gambar_banner);

        profile = (ImageView) findViewById(R.id.gambar_profil);

        nama = (TextView) findViewById(R.id.text_nama);

        konten = (TextView) findViewById(R.id.text_kontent);

        submit = (Button) findViewById(R.id.tombol_submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, konten.getText().toString());
                i.setType("text/plain");
                startActivity(i);

            }
        });


    }
}
