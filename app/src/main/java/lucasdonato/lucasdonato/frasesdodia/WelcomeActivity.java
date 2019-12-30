package lucasdonato.lucasdonato.frasesdodia;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class WelcomeActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationSplash;

    Button mStartMainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        mStartMainButton = findViewById(R.id.welcomeHome);

        mStartMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeStart();
            }
        });

        lottieAnimationSplash = (LottieAnimationView) findViewById(R.id.lottieAnimationView);
        startCheckAnimation();


    }

    private void startCheckAnimation() {
        ValueAnimator animator = ValueAnimator.ofFloat(0f,1f).setDuration(3500);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                lottieAnimationSplash.setProgress((Float)animation.getAnimatedValue());
            }
        });

        if(lottieAnimationSplash.getProgress() == 0f){
            animator.setStartDelay(1500);
            animator.setRepeatCount(10);
            animator.start();

        }
        else {
            lottieAnimationSplash.setProgress(0f);
        }
    }
    public void welcomeStart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
