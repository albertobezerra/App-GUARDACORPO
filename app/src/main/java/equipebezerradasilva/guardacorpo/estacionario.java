package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class estacionario extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estacionario);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);


        int[] lista = new int[]{

                R.drawable.menu_principal_normas, R.drawable.menu_principal_ca, R.drawable.menu_principal_clt, R.drawable.menu_principal_treinamentos, R.drawable.menu_principal_primeirossocorros,
                R.drawable.menu_principal_dds, R.drawable.menu_principal_sinalizacao, R.drawable.menu_principal_mapa, R.drawable.menu_principal_datas, R.drawable.menu_principal_tecnico,
                R.drawable.menu_principal_penalidades, R.drawable.menu_principal_aso, R.drawable.menu_principal_cid, R.drawable.menu_principal_cipa, R.drawable.menu_principal_historia,
                R.drawable.menu_principal_nbr, R.drawable.menu_principal_nho,

        };


        GridView gv = (GridView) findViewById(R.id.grid_estacionario);

        gv.setAdapter(new adaptador(this, lista));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), normas.class);
                    startActivityForResult(myIntent, 0);

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ca.class);
                    startActivityForResult(myIntent, 1);
                    displayInterstitial();
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), clt.class);
                    startActivityForResult(myIntent, 2);
                    displayInterstitial();
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), treinamentos.class);
                    startActivityForResult(myIntent, 3);

                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros.class);
                    startActivityForResult(myIntent, 4);

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), dds_estacionario.class);
                    startActivityForResult(myIntent, 5);

                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), sinalizacao.class);
                    startActivityForResult(myIntent, 6);
                    displayInterstitial();
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), mapa.class);
                    startActivityForResult(myIntent, 7);
                    displayInterstitial();
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), datas.class);
                    startActivityForResult(myIntent, 8);
                    displayInterstitial();
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), tecnico.class);
                    startActivityForResult(myIntent, 9);
                    displayInterstitial();
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), penalidades.class);
                    startActivityForResult(myIntent, 10);
                    displayInterstitial();
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), aso.class);
                    startActivityForResult(myIntent, 11);
                    displayInterstitial();
                }

                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), cid.class);
                    startActivityForResult(myIntent, 12);
                    displayInterstitial();
                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), cipa.class);
                    startActivityForResult(myIntent, 13);
                    displayInterstitial();
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), historia.class);
                    startActivityForResult(myIntent, 14);
                    displayInterstitial();
                }

                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), nbrs.class);
                    startActivityForResult(myIntent, 15);
                    displayInterstitial();
                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), nho_estacionario.class);
                    startActivityForResult(myIntent, 16);
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
}
