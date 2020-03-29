package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
