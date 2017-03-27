package com.nicolehaberman.magiceightball;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private MagicAnswers magicAnswers;

    AnimationDrawable frameAnimation = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        magicAnswers = new MagicAnswers();

    }

        public void giveAnswer(View v) {


            TextView answer = (TextView) findViewById(R.id.answer);
            magicAnswers.getmAnswers();
            ImageView circle = (ImageView)findViewById(R.id.magic_ball);

            startRotate(answer);
            rotateMagicBall(circle);
            answer.setText(magicAnswers.setmAnswers());

        }

    public void startRotate(TextView answer) {

        performAnimation(R.anim.spin);
        answer.setVisibility(View.INVISIBLE);
    }

    public void rotateMagicBall(ImageView ball) {

        performAnimation(R.anim.spin);

    }

    private void performAnimation(int animationResourceID) {
        Animation an = AnimationUtils.loadAnimation(this, animationResourceID);
        an.setAnimationListener(new MyAnimationListener());
        TextView item = (TextView) findViewById(R.id.answer);
        item.startAnimation(an);

    }



    class MyAnimationListener implements Animation.AnimationListener{
        public void onAnimationStart(Animation animation) {
            // Disable all buttons while animation is running

        }

        public void onAnimationEnd(Animation animation) {
            // Enable all buttons once animation is over

        }

        public void onAnimationRepeat(Animation animation) {
            // what to do when animation loops
        }
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
