package com.example.ravel.newtravellist;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.animation.AnimatorSet;


public class ActivityPanel extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ImageView imageView, clicavel;
        Animation animationFadeIn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_panel);

        imageView = (ImageView) findViewById(R.id.imageView);
        animationFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);

        imageView.startAnimation(animationFadeIn);

        clicavel = (ImageView) findViewById(R.id.buttonClicavel);

        clicavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityPanel.this, MenuActivity.class));

            }
        });







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_panel, menu);
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
