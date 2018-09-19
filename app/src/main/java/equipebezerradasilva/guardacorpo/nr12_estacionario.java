package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class nr12_estacionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr12_estacionario);

        AdView mAdView = (AdView) findViewById(R.id.adView_nr12_estacionario);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void voltar_nr(View view) {

        Intent secondActivity = new Intent(this, normas.class);
        startActivity(secondActivity);
    }

    public void ir_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12.class);
        startActivity(secondActivity);
    }

    public void ir_anexo1_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo1.class);
        startActivity(secondActivity);
    }

    public void ir_anexo2_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo2.class);
        startActivity(secondActivity);
    }


    public void ir_anexo3_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo3.class);
        startActivity(secondActivity);
    }

    public void ir_anexo4_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo4.class);
        startActivity(secondActivity);
    }

    public void ir_anexo5_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo5.class);
        startActivity(secondActivity);
    }

    public void ir_anexo6_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo6.class);
        startActivity(secondActivity);
    }

    public void ir_anexo7_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo7.class);
        startActivity(secondActivity);
    }

    public void ir_anexo8_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo8.class);
        startActivity(secondActivity);
    }

    public void ir_anexo9_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo9.class);
        startActivity(secondActivity);
    }

    public void ir_anexo10_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo10.class);
        startActivity(secondActivity);
    }

    public void ir_anexo11_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo11.class);
        startActivity(secondActivity);
    }

    public void ir_anexo12_nr12(View view) {

        Intent secondActivity = new Intent(this, nr12_anexo12.class);
        startActivity(secondActivity);
    }


}

