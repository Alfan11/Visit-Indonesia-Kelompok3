package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia_kelompok3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivitySumatra extends AppCompatActivity {
    Button btkbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra);

        setTitle("Sumatra");

        btkbt = (Button) findViewById(R.id.bt1);

        btkbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivitySumatra.this, DetailActivity.class));
            }
        });
    }
}
