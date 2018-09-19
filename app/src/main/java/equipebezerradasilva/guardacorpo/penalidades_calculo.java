package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class penalidades_calculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penalidades_calculo);

        AdView mAdView = (AdView) findViewById(R.id.adView_penalidades);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        final float[] inicial = new float[1];

        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                TextView infracao = (TextView) findViewById(R.id.infracao);
                TextView funcinarios = (TextView) findViewById(R.id.funcionarios);
                TextView mtInicial = (TextView) findViewById(R.id.mtInicial);
                TextView mtRecorrente = (TextView) findViewById(R.id.mtRecorrente);

                int infra = Integer.parseInt(infracao.getText().toString());
                int func = Integer.parseInt(funcinarios.getText().toString());

                inicial[0] = infra + (func * 2);


                if (inicial[0]<=7){
                    mtInicial.setText("R$670,38");
                    mtRecorrente.setText("R$775,73");
                }else{

                    if (inicial[0]<=9){
                        mtInicial.setText("R$776,79");
                        mtRecorrente.setText("R$883,20");
                    }else{

                        if (inicial[0]<=11){
                            mtInicial.setText("R$884,27");
                            mtRecorrente.setText("R$1.024,73");
                        }else{

                            if (inicial[0]<=13){
                                mtInicial.setText("R$1.025,79");
                                mtRecorrente.setText("R$1.174,77");
                            }else{

                                if (inicial[0]<=15){
                                    mtInicial.setText("R$1.175,83");
                                    mtRecorrente.setText("R$1.320,55");
                                }else{

                                    if (inicial[0]<=17){
                                        mtInicial.setText("R$1.321,61");
                                        mtRecorrente.setText("R$1462,07");
                                    }else{

                                        if (inicial[0]<=19){
                                            mtInicial.setText("R$1.463,14");
                                            mtRecorrente.setText("R$1.603,60");
                                        }else{

                                            if (inicial[0]<=21){
                                                mtInicial.setText("R$1.604,66");
                                                mtRecorrente.setText("R$1.751,51");
                                            }else{




                                                /**  AQUI COMECA OUTRO ---------- INFRA 2 **/

                                                if (inicial[0]<=27){
                                                    mtInicial.setText("R$1.201,37");
                                                    mtRecorrente.setText("R$1.482,29");
                                                }else{

                                                    if (inicial[0]<=29){
                                                        mtInicial.setText("R$1.483,36");
                                                        mtRecorrente.setText("R$1.770,66");
                                                    }else{

                                                        if (inicial[0]<=31){
                                                            mtInicial.setText("R$1.771,73");
                                                            mtRecorrente.setText("R$2.059,03");
                                                        }else{

                                                            if (inicial[0]<=33){
                                                                mtInicial.setText("R$2.060,10");
                                                                mtRecorrente.setText("R$2.341,02");
                                                            }else{

                                                                if (inicial[0]<=35){
                                                                    mtInicial.setText("R$2.342,08");
                                                                    mtRecorrente.setText("R$2.629,39");
                                                                }else{

                                                                    if (inicial[0]<=37){
                                                                        mtInicial.setText("R$2.630,46");
                                                                        mtRecorrente.setText("R$2.924,15");
                                                                    }else{

                                                                        if (inicial[0]<=39){
                                                                            mtInicial.setText("R$2.925,21");
                                                                            mtRecorrente.setText("R$3.213,58");
                                                                        }else{

                                                                            if (inicial[0]<=41){
                                                                                mtInicial.setText("R$3.241,65");
                                                                                mtRecorrente.setText("R$3.494,50");
                                                                            }else{



                                                                                /**  AQUI COMECA OUTRO ----- INFRA 3 **/

                                                                                if (inicial[0]<=43){
                                                                                    mtInicial.setText("R$1.799,39");
                                                                                    mtRecorrente.setText("R$2.225,03");
                                                                                }else{
                                                                                    if (inicial[0]<=45){
                                                                                        mtInicial.setText("R$2.226,10");
                                                                                        mtRecorrente.setText("R$2.654,93");
                                                                                    }else{
                                                                                        if (inicial[0]<=47){
                                                                                            mtInicial.setText("R$2.655,99");
                                                                                            mtRecorrente.setText("R$3.083,76");
                                                                                        }else{
                                                                                            if (inicial[0]<=49){
                                                                                                mtInicial.setText("R$3.084,83");
                                                                                                mtRecorrente.setText("R$3.513,66");
                                                                                            }else{
                                                                                                if (inicial[0]<=51){
                                                                                                    mtInicial.setText("R$3.514,72");
                                                                                                    mtRecorrente.setText("R$3.956,32");
                                                                                                }else{
                                                                                                    if (inicial[0]<=53){
                                                                                                        mtInicial.setText("R$3.957,39");
                                                                                                        mtRecorrente.setText("R$4.385,16");
                                                                                                    }else{
                                                                                                        if (inicial[0]<=54){
                                                                                                            mtInicial.setText("R$4.386,22");
                                                                                                            mtRecorrente.setText("R$4.815,05");
                                                                                                        }else{
                                                                                                            if (inicial[0]<=67){
                                                                                                                mtInicial.setText("R$4.816,12");
                                                                                                                mtRecorrente.setText("R$5.244,95");
                                                                                                            }else{



                                                                                                                /**  AQUI COMECA OUTRO  -------- INFRA 4  **/


                                                                                                                if (inicial[0]<=70){
                                                                                                                    mtInicial.setText("R$2.396,35");
                                                                                                                    mtRecorrente.setText("R$2.970,97");
                                                                                                                }else{

                                                                                                                    if (inicial[0]<=72){
                                                                                                                        mtInicial.setText("R$2.972,03");
                                                                                                                        mtRecorrente.setText("R$3.547,71");
                                                                                                                    }else{

                                                                                                                        if (inicial[0]<=74){
                                                                                                                            mtInicial.setText("R$3.548,77");
                                                                                                                            mtRecorrente.setText("R$4.124,45");
                                                                                                                        }else{

                                                                                                                            if (inicial[0]<=76){
                                                                                                                                mtInicial.setText("R$4.125,52");
                                                                                                                                mtRecorrente.setText("R$4.701,19");
                                                                                                                            }else{

                                                                                                                                if (inicial[0]<=78){
                                                                                                                                    mtInicial.setText("R$4.702,26");
                                                                                                                                    mtRecorrente.setText("R$5.265,17");
                                                                                                                                }else{

                                                                                                                                    if (inicial[0]<=80){
                                                                                                                                        mtInicial.setText("R$5.266,23");
                                                                                                                                        mtRecorrente.setText("R$5.841,91");
                                                                                                                                    }else{

                                                                                                                                        if (inicial[0]<=82){
                                                                                                                                            mtInicial.setText("R$5.842,97");
                                                                                                                                            mtRecorrente.setText("R$6.419,72");
                                                                                                                                        }else{

                                                                                                                                            if (inicial[0]<=84){
                                                                                                                                                mtInicial.setText("R$6.420,78");
                                                                                                                                                mtRecorrente.setText("R$6.708,09");
                                                                                                                                            }else{


                                                                                                                                            }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

        });

    }

    public void voltar_penalidades(View view) {

        Intent secondActivity = new Intent(this, penalidades.class);
        startActivity(secondActivity);
    }

}
