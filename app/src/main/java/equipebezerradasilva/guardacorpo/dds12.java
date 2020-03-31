package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
public class dds12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dds12);
  
         AdView mAdView = (AdView) findViewById(R.id.adView_dds12);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void voltar_dds_estacionario(View view) {

        Intent secondActivity = new Intent(this, dds_estacionario.class);
        startActivity(secondActivity);
    }
}