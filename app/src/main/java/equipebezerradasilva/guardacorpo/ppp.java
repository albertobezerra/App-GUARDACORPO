package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ppp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppp);

        AdView mAdView = (AdView) findViewById(R.id.adView_ppp);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void voltar_estacionario(View view) {

        Intent secondActivity = new Intent(this, estacionario.class);
        startActivity(secondActivity);
    }

    public void exemploppp(View view) {

        Intent browserInternt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.inss.gov.br/wp-content/uploads/2017/05/IN85PRESINSSanexoI_PPP.pdf"));
        startActivity(browserInternt);
    }
}
