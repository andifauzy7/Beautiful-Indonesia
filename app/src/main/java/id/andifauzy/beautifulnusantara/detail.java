package id.andifauzy.beautifulnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    ImageView photo;
    TextView nama, lokasi, desc1, desc2, rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Detail");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        photo = findViewById(R.id.imageView);
        nama = findViewById(R.id.nama);
        lokasi = findViewById(R.id.lokasi);
        desc1 = findViewById(R.id.desc1);
        desc2 = findViewById(R.id.desc2);
        rating = findViewById(R.id.rating);

        String sNama = getIntent().getStringExtra("NAME");
        nama.setText(sNama);
        String sLokasi = getIntent().getStringExtra("LOCATION");
        lokasi.setText(sLokasi);
        String sDesc1 = getIntent().getStringExtra("DESC1");
        desc1.setText(sDesc1);
        String sDesc2 = getIntent().getStringExtra("DESC2");
        desc2.setText(sDesc2);
        Double dRating = getIntent().getDoubleExtra("RATING",0);
        String sRating = dRating + "/10";
        rating.setText(sRating);
        photo.setImageResource(getIntent().getIntExtra("PHOTO", 0));
    }
}
