package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class nho07 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nho07);

        AdView mAdView = (AdView) findViewById(R.id.adView_nho07);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = (PDFView) findViewById(R.id.nho07);
        pdfView.fromAsset("NHO07.pdf").load();
    }

    public void voltar_nho_estacionario(View view) {

        Intent secondActivity = new Intent(this, nho_estacionario.class);
        startActivity(secondActivity);
    }

}

