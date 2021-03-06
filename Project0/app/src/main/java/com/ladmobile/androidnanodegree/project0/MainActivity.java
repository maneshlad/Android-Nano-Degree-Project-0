package com.ladmobile.androidnanodegree.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button button;


    private void showToast(int id,final String message)
    {
        button = (Button) findViewById(id);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        message, Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast(R.id.buttonSpotify,"Spotify Button Clicked");
        showToast(R.id.buttonScores,"Scores Button Clicked");
        showToast(R.id.buttonLibrary,"Library Button Clicked");
        showToast(R.id.buttonBuild,"Build it Better Button Clicked");
        showToast(R.id.buttonCapstone,"Capstone Button Clicked");
        showToast(R.id.buttonXyz,"XYZ Reader Button Clicked");

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
}
