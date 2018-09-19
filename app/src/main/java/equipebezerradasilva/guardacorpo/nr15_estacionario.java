package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class nr15_estacionario extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr15_estacionario);

        AdView mAdView = (AdView) findViewById(R.id.adView_nr15_estacionario);
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

    public void ir_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo1_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo1.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo2_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo2.class);
        startActivity(secondActivity);
        displayInterstitial();
    }


    public void ir_anexo3_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo3.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo4_nr15(View view) {


    }

    public void ir_anexo5_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo5.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo6_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo6.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo7_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo7.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo8_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo8.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo9_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo9.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo10_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo10.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo11_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo11.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo12_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo12.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo13_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo13.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo13a_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo13a.class);
        startActivity(secondActivity);
        displayInterstitial();
    }

    public void ir_anexo14_nr15(View view) {

        Intent secondActivity = new Intent(this, nr15_anexo14.class);
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

