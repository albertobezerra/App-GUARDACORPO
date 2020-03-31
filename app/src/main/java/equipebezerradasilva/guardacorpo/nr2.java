package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class nr2 extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr2);


        AdView mAdView = (AdView) findViewById(R.id.adView_nr2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = (PDFView) findViewById(R.id.nr2);
        pdfView.fromAsset("NR2.pdf").load();
    }

    public void voltar_nr(View view) {

        Intent secondActivity = new Intent(this, normas.class);
        startActivity(secondActivity);
    }

}