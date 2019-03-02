package equipebezerradasilva.guardacorpo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.onesignal.OneSignal;

public class splash extends AppCompatActivity implements Runnable {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

        Handler handler = new Handler();
        handler.postDelayed(this, 2000);



    }

    @Override
    public void run() {
        startActivity(new Intent(this, estacionario.class));
        finish();
    }


}
