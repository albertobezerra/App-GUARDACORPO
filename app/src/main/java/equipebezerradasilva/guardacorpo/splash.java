package equipebezerradasilva.guardacorpo;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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
