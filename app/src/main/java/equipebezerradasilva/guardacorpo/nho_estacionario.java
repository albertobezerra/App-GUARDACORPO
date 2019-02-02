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

public class nho_estacionario extends AppCompatActivity implements Runnable{

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nho_estacionario);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        final ListView lista1 = (ListView) findViewById(R.id.lista_nho);
        final ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.lista_nho, android.R.layout.simple_list_item_1);
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), nho01.class);
                    startActivityForResult(myIntent, 0);

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), nho02.class);
                    startActivityForResult(myIntent, 1);

                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), nho03.class);
                    startActivityForResult(myIntent, 2);
                    displayInterstitial();
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), nho04.class);
                    startActivityForResult(myIntent, 3);
                    displayInterstitial();
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), nho05.class);
                    startActivityForResult(myIntent, 4);

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), nho06.class);
                    startActivityForResult(myIntent, 5);
                    displayInterstitial();
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), nho07.class);
                    startActivityForResult(myIntent, 6);

                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), nho08.class);
                    startActivityForResult(myIntent, 7);
                    displayInterstitial();
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), nho09.class);
                    startActivityForResult(myIntent, 8);
                    displayInterstitial();
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), nho10.class);
                    startActivityForResult(myIntent, 9);
                    displayInterstitial();
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), nho11.class);
                    startActivityForResult(myIntent, 10);

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

