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

public class normas extends AppCompatActivity implements Runnable{

    private InterstitialAd interstitialAd;
    private ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normas);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        int[] lista2 = new int[]{

                R.drawable.btnnr01, R.drawable.btnnr02, R.drawable.btnnr03, R.drawable.btnnr04, R.drawable.btnnr05, R.drawable.btnnr06,
                R.drawable.btnnr07, R.drawable.btnnr08, R.drawable.btnnr09, R.drawable.btnnr10, R.drawable.btnnr11, R.drawable.btnnr12,
                R.drawable.btnnr13, R.drawable.btnnr14,
                R.drawable.btnnr15, R.drawable.btnnr15a1, R.drawable.btnnr15a2, R.drawable.btnnr15a3, R.drawable.btnnr15a4,
                R.drawable.btnnr15a5, R.drawable.btnnr15a6, R.drawable.btnnr15a7, R.drawable.btnnr15a8, R.drawable.btnnr15a9,
                R.drawable.btnnr15a10, R.drawable.btnnr15a11, R.drawable.btnnr15a12, R.drawable.btnnr15a13, R.drawable.btnnr15a13a, R.drawable.btnnr15a14,
                R.drawable.btnnr16, R.drawable.btnnr17, R.drawable.btnnr17a1, R.drawable.btnnr17a2, R.drawable.btnnr18, R.drawable.btnnr19,
                R.drawable.btnnr20, R.drawable.btnnr21, R.drawable.btnnr22, R.drawable.btnnr23, R.drawable.btnnr24,
                R.drawable.btnnr25, R.drawable.btnnr26, R.drawable.btnnr27, R.drawable.btnnr28, R.drawable.btnnr29,
                R.drawable.btnnr30, R.drawable.btnnr30a1, R.drawable.btnnr30a2, R.drawable.btnnr31, R.drawable.btnnr32,
                R.drawable.btnnr33, R.drawable.btnnr34, R.drawable.btnnr35, R.drawable.btnnr36, R.drawable.btnnr37,
        };


        GridView gv = (GridView) findViewById(R.id.grid_normas);

        gv.setAdapter(new adaptador(this, lista2));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nr1.class);
                    startActivityForResult(myIntent, 0);

                }

                if (position == 1) {

                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), nr3.class);
                    startActivityForResult(myIntent, 2);

                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), nr4.class);
                    startActivityForResult(myIntent, 3);

                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), nr5.class);
                    startActivityForResult(myIntent, 4);

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), nr6.class);
                    startActivityForResult(myIntent, 5);

                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), nr7.class);
                    startActivityForResult(myIntent, 6);

                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), nr8.class);
                    startActivityForResult(myIntent, 7);

                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), nr9.class);
                    startActivityForResult(myIntent, 8);

                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), nr10.class);
                    startActivityForResult(myIntent, 9);

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
