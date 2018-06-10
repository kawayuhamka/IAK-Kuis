package tech.indi.latihaniak3;

/**
 * Created by Jefri Yushendri on 3/12/2017.
 */

public class QuizModel {
    String pertayaan, opsi_a, opsi_b, opsi_c, jawaban;


public QuizModel(String pertanyaan,String opsi_a, String opsi_b, String opsi_c, String jawaban){
    this.pertayaan = pertanyaan;
    this.opsi_a = opsi_a;
    this.opsi_b = opsi_b;
    this.opsi_c = opsi_c;
    this.jawaban = jawaban;

}

    public String getPertayaan() {
        return pertayaan;
    }

    public void setPertayaan(String pertayaan) {
        this.pertayaan = pertayaan;
    }

    public String getOpsi_a() {
        return opsi_a;
    }

    public void setOpsi_a(String opsi_a) {
        this.opsi_a = opsi_a;
    }

    public String getOpsi_b() {
        return opsi_b;
    }

    public void setOpsi_b(String opsi_b) {
        this.opsi_b = opsi_b;
    }

    public String getOpsi_c() {
        return opsi_c;
    }

    public void setOpsi_c(String opsi_c) {
        this.opsi_c = opsi_c;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
}
