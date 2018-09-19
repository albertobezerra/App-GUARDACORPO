package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class nr11_estacionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr11_estacionario);

        AdView mAdView = (AdView) findViewById(R.id.adView_nr11_estacionario);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void voltar_nr(View view) {

        Intent secondActivity = new Intent(this, normas.class);
        startActivity(secondActivity);
    }

    public void ir_nr11(View view) {

        Intent secondActivity = new Intent(this, nr11.class);
        startActivity(secondActivity);
    }

    public void ir_anexo1_nr11(View view) {

        Intent secondActivity = new Intent(this, nr11_anexo1.class);
        startActivity(secondActivity);
    }

}
