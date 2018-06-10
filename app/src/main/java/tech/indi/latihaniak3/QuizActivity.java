package tech.indi.latihaniak3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import tech.indi.latihanlayout.R;

public class QuizActivity extends AppCompatActivity {

    TextView pertanyaan;
    RadioGroup pilihan_jawaban;
    RadioButton opsi_a, opsi_b, opsi_c;
    Button submit;
    List<QuizModel> quizModelList = new ArrayList<>();
    int no = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        pertanyaan = (TextView) findViewById(R.id.text_pertanyaan);

        pilihan_jawaban = (RadioGroup) findViewById(R.id.pilihan_jawaban);

        opsi_a = (RadioButton) findViewById(R.id.opsi_a);
        opsi_b = (RadioButton) findViewById(R.id.opsi_b);
        opsi_c = (RadioButton) findViewById(R.id.opsi_c);
        submit= (Button) findViewById(R.id.submit);

        persiapanData();
        setDatatoView();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no<quizModelList.size()){
                    checkAnswer();
                    no++;
                }

                if(no<quizModelList.size()){
                    setDatatoView();
                }
                else{
                    Intent i = new Intent(QuizActivity.this, HasilActivity.class);
                    i.putExtra("SCORE", score);
                    startActivity(i);
                    finish();

                }


            }
        });



    }


    private void setSoal(String pertanyaan, String opsi_a, String opsi_b, String opsi_c, String jawaban){
        QuizModel quizModel = new QuizModel(pertanyaan, opsi_a, opsi_b, opsi_c, jawaban);
        quizModelList.add(quizModel);

    }


    private void persiapanData(){
        setSoal("Jenis view untuk menampilkan gambar disebut?", "ImageView", "PictureView", "BackgroundView", "A");

    setSoal("untuk berpindah dari satu activity ke activity lain dapat menggunakan perintah?", "Move", "Change", "Intent", "C");

    }



    private void setDatatoView(){
        pertanyaan.setText(quizModelList.get(no).getPertayaan());
        opsi_a.setText(quizModelList.get(no).getOpsi_a());
        opsi_b.setText(quizModelList.get(no).getOpsi_b());
        opsi_c.setText(quizModelList.get(no).getOpsi_c());

    }


    private void checkAnswer(){
        int index;

        switch (quizModelList.get(no).getJawaban()){
            case "A":
                index =0;
                break;
            case "B":
                index = 1;
                break;
            case "C":
                index=2;
                break;
            default:
                index=0;
                break;
        }

        int index_pilihan = pilihan_jawaban.indexOfChild(findViewById(pilihan_jawaban.getCheckedRadioButtonId()));

        if(index==index_pilihan){
            score+=10;
            Toast.makeText(getApplicationContext(), "Benar SCORE :"+score, Toast.LENGTH_LONG).show();

        }
        else{
            score-=5;
            Toast.makeText(getApplicationContext(), "Salah SCORE :"+score, Toast.LENGTH_LONG).show();
        }
        pilihan_jawaban.clearCheck();

    }








}
