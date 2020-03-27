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

                R.drawable.btnnr01, R.drawable.btnnr02,R.drawable.btnnr03,R.drawable.btnnr04,R.drawable.btnnr05,R.drawable.btnnr06,
                R.drawable.btnnr07,R.drawable.btnnr08,R.drawable.btnnr09, R.drawable.btnnr10, R.drawable.btnnr11, R.drawable.btnnr11a1,
                R.drawable.btnnr12,R.drawable.btnnr13, R.drawable.btnnr14,
                R.drawable.btnnr15, R.drawable.btnnr15a1, R.drawable.btnnr15a2, R.drawable.btnnr15a3, R.drawable.btnnr15a4,
                R.drawable.btnnr15a5, R.drawable.btnnr15a6, R.drawable.btnnr15a7, R.drawable.btnnr15a8, R.drawable.btnnr15a9,
                R.drawable.btnnr15a10, R.drawable.btnnr15a11, R.drawable.btnnr15a12, R.drawable.btnnr15a13, R.drawable.btnnr15a13a,
                R.drawable.btnnr15a14, R.drawable.btnnr16, R.drawable.btnnr17, R.drawable.btnnr17a1, R.drawable.btnnr17a2,
                R.drawable.btnnr18, R.drawable.btnnr19, R.drawable.btnnr20, R.drawable.btnnr21, R.drawable.btnnr22, R.drawable.btnnr23,
                R.drawable.btnnr24, R.drawable.btnnr25, R.drawable.btnnr26, R.drawable.btnnr27, R.drawable.btnnr28, R.drawable.btnnr29,
                R.drawable.btnnr30, R.drawable.btnnr31, R.drawable.btnnr32, R.drawable.btnnr33, R.drawable.btnnr34, R.drawable.btnnr35,
                R.drawable.btnnr36, R.drawable.btnnr37,
         };


        GridView gv = (GridView) findViewById(R.id.grid_nrs);

        gv.setAdapter(new adaptador(this, lista2));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nr1.class);
                    startActivityForResult(myIntent, 0);

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), nr2.class);
                    startActivityForResult(myIntent, 1);

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

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), nr11_estacionario.class);
                    startActivityForResult(myIntent, 10);

                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), nr12_estacionario.class);
                    startActivityForResult(myIntent, 11);

                }

                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), nr13.class);
                    startActivityForResult(myIntent, 12);

                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), nr14.class);
                    startActivityForResult(myIntent, 13);

                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), nr15_estacionario.class);
                    startActivityForResult(myIntent, 14);

                }

                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), nr16.class);
                    startActivityForResult(myIntent, 15);

                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), nr17_estacionario.class);
                    startActivityForResult(myIntent, 16);

                }

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), nr18.class);
                    startActivityForResult(myIntent, 17);

                }

                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), nr19.class);
                    startActivityForResult(myIntent, 18);

                }

                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), nr20.class);
                    startActivityForResult(myIntent, 19);

                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), nr21.class);
                    startActivityForResult(myIntent, 20);

                }

                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), nr22.class);
                    startActivityForResult(myIntent, 21);

                }

                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), nr23.class);
                    startActivityForResult(myIntent, 22);

                }

                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), nr24.class);
                    startActivityForResult(myIntent, 23);

                }

                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), nr25.class);
                    startActivityForResult(myIntent, 24);

                }

                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), nr26.class);
                    startActivityForResult(myIntent, 25);

                }

                if (position == 26) {

                }

                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), nr28.class);
                    startActivityForResult(myIntent, 27);

                }

                if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), nr29.class);
                    startActivityForResult(myIntent, 28);

                }

                if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), nr30.class);
                    startActivityForResult(myIntent, 29);

                }

                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), nr31.class);
                    startActivityForResult(myIntent, 30);

                }

                if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), nr32.class);
                    startActivityForResult(myIntent, 31);

                }

                if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), nr33.class);
                    startActivityForResult(myIntent, 32);

                }

                if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), nr34.class);
                    startActivityForResult(myIntent, 33);

                }

                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), nr35.class);
                    startActivityForResult(myIntent, 34);

                }

                if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), nr36.class);
                    startActivityForResult(myIntent, 35);

                }

                if (position == 36) {
                    Intent myIntent = new Intent(view.getContext(), nr37.class);
                    startActivityForResult(myIntent, 36);

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
