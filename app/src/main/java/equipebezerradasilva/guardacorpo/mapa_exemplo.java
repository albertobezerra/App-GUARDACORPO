package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class mapa_exemplo extends AppCompatActivity {


    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_exemplo);

        pdfView = (PDFView) findViewById(R.id.mapa);
        pdfView.fromAsset("mapa.pdf").load();
    }

    public void voltar_mapa(View view) {

        Intent secondActivity = new Intent(this, mapa.class);
        startActivity(secondActivity);
    }

}
