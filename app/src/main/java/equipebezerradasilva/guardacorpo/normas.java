package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

        final ListView lista1 = (ListView) findViewById(R.id.lista_nr);
        final ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.menu_nr, android.R.layout.simple_list_item_1);
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nr1.class);
                    startActivityForResult(myIntent, 0);
                    displayInterstitial();

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), nr2.class);
                    startActivityForResult(myIntent, 1);
                    displayInterstitial();
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), nr3.class);
                    startActivityForResult(myIntent, 2);
                    displayInterstitial();
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), nr4.class);
                    startActivityForResult(myIntent, 3);
                    displayInterstitial();
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), nr5.class);
                    startActivityForResult(myIntent, 4);
                    displayInterstitial();
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), nr6.class);
                    startActivityForResult(myIntent, 5);
                    displayInterstitial();
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), nr7.class);
                    startActivityForResult(myIntent, 6);
                    displayInterstitial();
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), nr8.class);
                    startActivityForResult(myIntent, 7);
                    displayInterstitial();
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), nr9.class);
                    startActivityForResult(myIntent, 8);
                    displayInterstitial();
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), nr10.class);
                    startActivityForResult(myIntent, 9);
                    displayInterstitial();
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), nr11_estacionario.class);
                    startActivityForResult(myIntent, 10);
                    displayInterstitial();
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), nr12_estacionario.class);
                    startActivityForResult(myIntent, 11);
                    displayInterstitial();
                }

                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), nr13.class);
                    startActivityForResult(myIntent, 12);
                    displayInterstitial();
                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), nr14.class);
                    startActivityForResult(myIntent, 13);
                    displayInterstitial();
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), nr15_estacionario.class);
                    startActivityForResult(myIntent, 14);
                    displayInterstitial();
                }

                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), nr16.class);
                    startActivityForResult(myIntent, 15);
                    displayInterstitial();
                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), nr17_estacionario.class);
                    startActivityForResult(myIntent, 16);
                    displayInterstitial();
                }

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), nr18.class);
                    startActivityForResult(myIntent, 17);
                    displayInterstitial();
                }

                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), nr19.class);
                    startActivityForResult(myIntent, 18);
                    displayInterstitial();
                }

                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), nr20.class);
                    startActivityForResult(myIntent, 19);
                    displayInterstitial();
                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), nr21.class);
                    startActivityForResult(myIntent, 20);
                    displayInterstitial();
                }

                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), nr22.class);
                    startActivityForResult(myIntent, 21);
                    displayInterstitial();
                }

                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), nr23.class);
                    startActivityForResult(myIntent, 22);
                    displayInterstitial();
                }

                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), nr24.class);
                    startActivityForResult(myIntent, 23);
                    displayInterstitial();
                }

                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), nr25.class);
                    startActivityForResult(myIntent, 24);
                    displayInterstitial();
                }

                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), nr26.class);
                    startActivityForResult(myIntent, 25);
                    displayInterstitial();
                }

                if (position == 26) {

                }

                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), nr28.class);
                    startActivityForResult(myIntent, 27);
                    displayInterstitial();
                }

                if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), nr29.class);
                    startActivityForResult(myIntent, 28);
                    displayInterstitial();
                }

                if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), nr30.class);
                    startActivityForResult(myIntent, 29);
                    displayInterstitial();
                }

                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), nr31.class);
                    startActivityForResult(myIntent, 30);
                    displayInterstitial();
                }

                if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), nr32.class);
                    startActivityForResult(myIntent, 31);
                    displayInterstitial();
                }

                if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), nr33.class);
                    startActivityForResult(myIntent, 32);
                    displayInterstitial();
                }

                if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), nr34.class);
                    startActivityForResult(myIntent, 33);
                    displayInterstitial();
                }

                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), nr35.class);
                    startActivityForResult(myIntent, 34);
                    displayInterstitial();
                }

                if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), nr36.class);
                    startActivityForResult(myIntent, 35);
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
