package id.andifauzy.beautifulnusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private RecyclerView viewDestination;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewDestination = findViewById(R.id.list_destination);
        viewDestination.setHasFixedSize(true);
        viewDestination.setLayoutManager(new LinearLayoutManager(this));
        DestinationAdapter destinationAdapter = new DestinationAdapter();
        viewDestination.setAdapter(destinationAdapter);
    }
}
