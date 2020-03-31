package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sinalizacao_exemplo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinalizacao_exemplo);
    }

    public void voltar_sinalizacao(View view) {

        Intent secondActivity = new Intent(this, sinalizacao.class);
        startActivity(secondActivity);
    }
}
