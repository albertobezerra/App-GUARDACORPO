package equipebezerradasilva.guardacorpo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.onesignal.OneSignal;

public class estacionario extends AppCompatActivity implements Runnable {

    private InterstitialAd interstitialAd;
    private final  int REQUEST_ACESS_FINE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estacionario);

            // OneSignal Initialization
            OneSignal.startInit(this)
                    .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                    .unsubscribeWhenNotificationsAreDisabled(true)
                    .init();


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_ACESS_FINE);

        MobileAds.initialize(this, "ca-app-pub-7979689703488774~3810164338");

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.inters));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);


        int[] lista = new int[]{

                R.drawable.btn1, R.drawable.btn2, R.drawable.btn3, R.drawable.btn4, R.drawable.btn5,
                R.drawable.btn6, R.drawable.btn7, R.drawable.btn8, R.drawable.btn9, R.drawable.btn10,
                R.drawable.btn11, R.drawable.btn12, R.drawable.btn13, R.drawable.btn14, R.drawable.btn15,
                R.drawable.btn16, R.drawable.btn17, R.drawable.btn18, R.drawable.btn19, R.drawable.btn20,
                R.drawable.btn21, R.drawable.btn22, R.drawable.btn23, R.drawable.btn24, R.drawable.btn25,
                R.drawable.btn26
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
                    Intent myIntent = new Intent(view.getContext(), datas.class);
                    startActivityForResult(myIntent, 7);
                    displayInterstitial();
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), mapa.class);
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

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), epi.class);
                    startActivityForResult(myIntent, 17);
                    displayInterstitial();
                }

                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), cnae.class);
                    startActivityForResult(myIntent, 18);
                    displayInterstitial();
                }

                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), cnpj.class);
                    startActivityForResult(myIntent, 19);
                    displayInterstitial();
                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), ordemdeservico.class);
                    startActivityForResult(myIntent, 20);
                    displayInterstitial();
                }

                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), ppp.class);
                    startActivityForResult(myIntent, 21);
                    displayInterstitial();
                }

                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), incendio.class);
                    startActivityForResult(myIntent, 22);
                    displayInterstitial();
                }

                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), acidentesdetrabalho.class);
                    startActivityForResult(myIntent, 23);
                    displayInterstitial();
                }

                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), riscos.class);
                    startActivityForResult(myIntent, 24);
                    displayInterstitial();
                }

                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), esocial.class);
                    startActivityForResult(myIntent, 25);
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_ACESS_FINE){
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                Toast.makeText(this, "Permitido", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Acesso negado", Toast.LENGTH_LONG).show();
        }
    }
}
