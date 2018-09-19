package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class nr15_anexo11 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr15_anexo11);

        AdView mAdView = (AdView) findViewById(R.id.adView_anexo11_nr15);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = (PDFView) findViewById(R.id.nr15_anexo11);
        pdfView.fromAsset("NR15_anexo11.pdf").load();
    }

    public void voltar_nr(View view) {

        Intent secondActivity = new Intent(this, nr15_estacionario.class);
        startActivity(secondActivity);
    }
}
