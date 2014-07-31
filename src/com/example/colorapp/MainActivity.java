package com.example.colorapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setButton();
    }
    
    private void setButton() {
    	// 1. Get a reference to the button
    	Button startButton = (Button) findViewById(R.id.buttonStart);
    	
    	// 2. Set the click listener to run my code.
    	View.OnClickListener myListener = new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Here we have to start the game.
				Log.i("StartButton", "Click successful");
				Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_LONG).show();
			}
    	};
    	startButton.setOnClickListener(myListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
