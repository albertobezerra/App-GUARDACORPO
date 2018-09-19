package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class nr17_estacionario extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr17_estacionario);

        AdView mAdView = (AdView) findViewById(R.id.adView_nr17_estacionario);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);
    }

    public void voltar_nr(View view) {

        Intent secondActivity = new Intent(this, normas.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_nr17(View view) {

        Intent secondActivity = new Intent(this, nr17.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo1_nr17(View view) {

        Intent secondActivity = new Intent(this, nr17_anexo1.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo2_nr17(View view) {

        Intent secondActivity = new Intent(this, nr17_anexo2.class);
        startActivity(secondActivity);
        displayInterstitial();
    }


    public void displayInterstitial(){
        if (interstitialAd.isLoaded()){
            interstitialAd.show();
        }
    }

    @Override
    public void run() {
        displayInterstitial();
        finish();

    }


}

