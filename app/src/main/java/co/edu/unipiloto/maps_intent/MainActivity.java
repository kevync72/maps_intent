package co.edu.unipiloto.maps_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMaps(View view) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https")
                .authority("www.google.com")
                .appendPath("maps")
                .appendPath("dir")
                .appendPath(" ")
                .appendQueryParameter("api", "1")
                .appendQueryParameter("destination", 4.66615523 + "," + -74.09219472);
        String url = builder.build().toString(); Log.d("Directions", url);
        Intent intent = new Intent(Intent.ACTION_VIEW); intent.setData(Uri.parse(url));startActivity(intent);

    }
}