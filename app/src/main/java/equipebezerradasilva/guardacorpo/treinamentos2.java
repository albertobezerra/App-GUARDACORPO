package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class treinamentos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinamentos2);


        AdView mAdView = (AdView) findViewById(R.id.adView_treinamentos2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void voltar_treinamentos(View view) {

        Intent secondActivity = new Intent(this, treinamentos.class);
        startActivity(secondActivity);
    }
}
