package com.example.laba4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//setContentView(R.layout.activity_main);
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.textViewFrontColor, null);
        int backgroundColor = resources.getColor(R.color.textViewBackColor, null);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        TextView textView = new TextView(this);
        textView.setText("Hello Android!");
        textView.setTextSize(32);
        textView.setTextColor(textColor);
        textView.setBackgroundColor(backgroundColor);
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
    }
}