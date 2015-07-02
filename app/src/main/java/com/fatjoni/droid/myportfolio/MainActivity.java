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
    private Toast mAppToast;

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
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotifyStreamer:
                //Stop any previous toasts
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this, "Run Spotify Streamer App", Toast.LENGTH_SHORT);
                mAppToast.show();
                break;

            case R.id.scoresApp:
                //Stop any previous toasts
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this, "Run Scores App", Toast.LENGTH_SHORT);
                mAppToast.show();
                break;
            case R.id.libraryApp:
                //Stop any previous toasts
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this, "Run Library App", Toast.LENGTH_SHORT);
                mAppToast.show();
                break;
            case R.id.buildItBigger:
                //Stop any previous toasts
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this, "Run Build it Bigger App", Toast.LENGTH_SHORT);
                mAppToast.show();
                break;
            case R.id.myOwnApp:
                //Stop any previous toasts
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this, "Run My Own App", Toast.LENGTH_SHORT);
                mAppToast.show();
                break;
        }
    }
}
