package id.andifauzy.beautifulnusantara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile :
                Intent intent = new Intent(MainActivity.this, profile.class);
                startActivity(intent);
                return true;
        }
        return false;
    }
}
