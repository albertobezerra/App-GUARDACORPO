package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ordemdeservico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordemdeservico);

        AdView mAdView = (AdView) findViewById(R.id.adView_ordemdeservico);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void ordemdeservico_exemplo(View view) {

        Intent secondActivity = new Intent(this, ordemdeservico_exemplo.class);
        startActivity(secondActivity);
    }

    public void voltar_estacionario(View view) {

        Intent secondActivity = new Intent(this, estacionario.class);
        startActivity(secondActivity);
    }
}
