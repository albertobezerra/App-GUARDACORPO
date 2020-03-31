package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class penalidades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penalidades);


    }

    public void voltar_estacionario(View view) {

        Intent secondActivity = new Intent(this, estacionario.class);
        startActivity(secondActivity);
    }

    public void calcular(View view) {

        Intent secondActivity = new Intent(this, penalidades_calculo.class);
        startActivity(secondActivity);
    }


}
