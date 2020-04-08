package id.andifauzy.beautifulnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("About");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}
