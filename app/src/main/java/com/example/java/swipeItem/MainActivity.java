package com.example.java.swipeItem;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import mainSwipe.swipeItem.view.SwipeItemView;

public class MainActivity extends AppCompatActivity {

    private SwipeItemView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (SwipeItemView) findViewById(R.id.swipe_item);

        View topView = new View(this);
        ViewCompat.setBackground(topView, new ColorDrawable(Color.RED));
        view.setTopContent(topView);

        View bottomView = new View(this);
        view.setBottomContent(bottomView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        view.dispatchTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
