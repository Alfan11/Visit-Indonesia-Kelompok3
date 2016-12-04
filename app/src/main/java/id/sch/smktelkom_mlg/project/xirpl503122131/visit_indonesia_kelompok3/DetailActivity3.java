package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia_kelompok3;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.model.Jawa;

public class DetailActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Jawa hotel = (Jawa) getIntent().getSerializableExtra(JawaActivity.HOTEL);
        setTitle(hotel.judul);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageURI(Uri.parse(hotel.foto));
        TextView tvDeskripsi = (TextView) findViewById(R.id.place_detail);
        tvDeskripsi.setText(hotel.deskripsi + "\n\n" + hotel.detail);
        TextView tvLokasi = (TextView) findViewById(R.id.place_location);
        tvLokasi.setText(hotel.lokasi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}