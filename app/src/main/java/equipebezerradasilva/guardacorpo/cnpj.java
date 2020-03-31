package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class cnpj extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnpj);

        AdView mAdView = (AdView) findViewById(R.id.adView_cnpj);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mWebView = (WebView) findViewById(R.id.web_cnpj);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.situacaocadastral.com.br/");
        mWebView.setWebViewClient(new WebViewClient()); // bloqueia abrir forar do webview - bloqueia navegador externo //
    }

    public void voltar_estacionario(View view) {

        Intent secondActivity = new Intent(this, estacionario.class);
        startActivity(secondActivity);
    }
}