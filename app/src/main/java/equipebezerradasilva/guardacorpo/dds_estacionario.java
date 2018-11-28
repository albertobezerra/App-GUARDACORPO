package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class dds_estacionario extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dds_estacionario);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

                interstitialAd = new InterstitialAd(this);
                interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
                AdRequest adRequest2 = new AdRequest.Builder().build();
                interstitialAd.loadAd(adRequest2);

                final ListView lista1 = (ListView) findViewById(R.id.lista_temasdedds);
                final ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.lista_temasdedds, android.R.layout.simple_list_item_1);
                lista1.setAdapter(adapter);

                lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {

                        if (position == 0) {
                            Intent myIntent = new Intent(view.getContext(), dds1.class);
                            startActivityForResult(myIntent, 0);


                        }

                        if (position == 1) {
                            Intent myIntent = new Intent(view.getContext(), dds2.class);
                            startActivityForResult(myIntent, 1);

                        }

                        if (position == 2) {
                            Intent myIntent = new Intent(view.getContext(), dds3.class);
                            startActivityForResult(myIntent, 2);
                            displayInterstitial();
                        }

                        if (position == 3) {
                            Intent myIntent = new Intent(view.getContext(), dds4.class);
                            startActivityForResult(myIntent, 3);
                            displayInterstitial();
                        }

                        if (position == 4) {
                            Intent myIntent = new Intent(view.getContext(), dds5.class);
                            startActivityForResult(myIntent, 4);

                        }

                        if (position == 5) {
                            Intent myIntent = new Intent(view.getContext(), dds6.class);
                            startActivityForResult(myIntent, 5);
                            displayInterstitial();
                        }

                        if (position == 6) {
                            Intent myIntent = new Intent(view.getContext(), dds7.class);
                            startActivityForResult(myIntent, 6);

                        }

                        if (position == 7) {
                            Intent myIntent = new Intent(view.getContext(), dds8.class);
                            startActivityForResult(myIntent, 7);
                            displayInterstitial();
                        }

                        if (position == 8) {
                            Intent myIntent = new Intent(view.getContext(), dds9.class);
                            startActivityForResult(myIntent, 8);
                            displayInterstitial();
                        }

                        if (position == 9) {
                            Intent myIntent = new Intent(view.getContext(), dds10.class);
                            startActivityForResult(myIntent, 9);
                            displayInterstitial();
                        }

                        if (position == 10) {
                            Intent myIntent = new Intent(view.getContext(), dds11.class);
                            startActivityForResult(myIntent, 10);

                        }

                        if (position == 11) {
                            Intent myIntent = new Intent(view.getContext(), dds12.class);
                            startActivityForResult(myIntent, 11);
                            displayInterstitial();
                        }

                        if (position == 12) {
                            Intent myIntent = new Intent(view.getContext(), dds13.class);
                            startActivityForResult(myIntent, 12);
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
