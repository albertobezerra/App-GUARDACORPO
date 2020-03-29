package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class treinamentos extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinamentos);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        int[] lista3 = new int[]{

                R.drawable.btntreinamentos1, R.drawable.btntreinamentos2, R.drawable.btntreinamentos3,
                R.drawable.btntreinamentos4, R.drawable.btntreinamentos5, R.drawable.btntreinamentos6,
                R.drawable.btntreinamentos7, R.drawable.btntreinamentos8, R.drawable.btntreinamentos9,
                R.drawable.btntreinamentos10, R.drawable.btntreinamentos11, R.drawable.btntreinamentos12,
        };


        GridView gv = (GridView) findViewById(R.id.grid_treinamentos);

        gv.setAdapter(new adaptador(this, lista3));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos1.class);
                    startActivityForResult(myIntent, 0);
                    displayInterstitial();

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos2.class);
                    startActivityForResult(myIntent, 1);
                    displayInterstitial();
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos3.class);
                    startActivityForResult(myIntent, 2);

                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos4.class);
                    startActivityForResult(myIntent, 3);
                    displayInterstitial();
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos5.class);
                    startActivityForResult(myIntent, 4);

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos6.class);
                    startActivityForResult(myIntent, 5);
                    displayInterstitial();
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos7.class);
                    startActivityForResult(myIntent, 6);
                    displayInterstitial();
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos8.class);
                    startActivityForResult(myIntent, 7);

                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos9.class);
                    startActivityForResult(myIntent, 8);
                    displayInterstitial();
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos10.class);
                    startActivityForResult(myIntent, 9);
                    displayInterstitial();
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos11.class);
                    startActivityForResult(myIntent, 10);

                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos12.class);
                    startActivityForResult(myIntent, 11);
                    displayInterstitial();
                }
            }
        });
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

    public void voltar_estacionario(View view) {

        Intent secondActivity = new Intent(this, estacionario.class);
        startActivity(secondActivity);
    }




}