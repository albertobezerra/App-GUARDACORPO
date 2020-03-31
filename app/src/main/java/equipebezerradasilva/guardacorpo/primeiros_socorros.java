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

public class primeiros_socorros extends AppCompatActivity implements Runnable{
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiros_socorros);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);

        int[] lista4 = new int[]{

                R.drawable.btnprimeirossocorros1, R.drawable.btnprimeirossocorros2, R.drawable.btnprimeirossocorros3,
                R.drawable.btnprimeirossocorros4, R.drawable.btnprimeirossocorros5, R.drawable.btnprimeirossocorros6,
                R.drawable.btnprimeirossocorros7, R.drawable.btnprimeirossocorros8, R.drawable.btnprimeirossocorros9,
                R.drawable.btnprimeirossocorros10, R.drawable.btnprimeirossocorros11, R.drawable.btnprimeirossocorros12,
                R.drawable.btnprimeirossocorros13,
        };


        GridView gv = (GridView) findViewById(R.id.grid_primeirossocorros);

        gv.setAdapter(new adaptador(this, lista4));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros01.class);
                    startActivityForResult(myIntent, 0);
                    displayInterstitial();

                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros02.class);
                    startActivityForResult(myIntent, 1);

                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros03.class);
                    startActivityForResult(myIntent, 2);

                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros04.class);
                    startActivityForResult(myIntent, 3);
                    displayInterstitial();
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros05.class);
                    startActivityForResult(myIntent, 4);

                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros06.class);
                    startActivityForResult(myIntent, 5);
                    displayInterstitial();
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros07.class);
                    startActivityForResult(myIntent, 6);
                    displayInterstitial();
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros08.class);
                    startActivityForResult(myIntent, 7);
                    displayInterstitial();
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros09.class);
                    startActivityForResult(myIntent, 8);
                    displayInterstitial();
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros10.class);
                    startActivityForResult(myIntent, 9);
                    displayInterstitial();
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros11.class);
                    startActivityForResult(myIntent, 10);
                    displayInterstitial();
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros12.class);
                    startActivityForResult(myIntent, 11);
                    displayInterstitial();
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), primeiros_socorros13.class);
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
