package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class primeiros_socorros12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiros_socorros12);


        AdView mAdView = (AdView) findViewById(R.id.adView_soco12);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void voltar_primeirossocorros(View view) {

        Intent secondActivity = new Intent(this, primeiros_socorros.class);
        startActivity(secondActivity);
    }
}
