package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class ordemdeservico_exemplo extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordemdeservico_exemplo);

        pdfView = (PDFView) findViewById(R.id.ordemdeservico);
        pdfView.fromAsset("ordemdeservico_exemplo.pdf").load();
    }

    public void voltar_ordemdeservico(View view) {

        Intent secondActivity = new Intent(this, ordemdeservico.class);
        startActivity(secondActivity);
    }
}
