package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia_kelompok3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by USER-ASUS on 31/10/2016.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}