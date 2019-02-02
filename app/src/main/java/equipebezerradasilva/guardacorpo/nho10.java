package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class nho10 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nho10);

        AdView mAdView = (AdView) findViewById(R.id.adView_nho10);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = (PDFView) findViewById(R.id.nho10);
        pdfView.fromAsset("NHO10.pdf").load();
    }

    public void voltar_nho_estacionario(View view) {

        Intent secondActivity = new Intent(this, nho_estacionario.class);
        startActivity(secondActivity);
    }

}

