package com.fatjoni.droid.myportfolio;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        Button scoresApp = (Button) findViewById(R.id.scoresApp);
        Button libraryApp = (Button) findViewById(R.id.libraryApp);
        Button buildItBigger = (Button) findViewById(R.id.buildItBigger);
        Button myOwnApp = (Button) findViewById(R.id.myOwnApp);

        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        myOwnApp.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotifyStreamer:
                Toast.makeText(this, "Run Spotify Streamer App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scoresApp:
                Toast.makeText(this,"Run Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.libraryApp:
                Toast.makeText(this,"Run Library App", Toast.LENGTH_SHORT).show();
            case R.id.buildItBigger:
                Toast.makeText(this,"Run Build it Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.myOwnApp:
                Toast.makeText(this,"Run My Own App", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
