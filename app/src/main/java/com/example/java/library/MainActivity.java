package com.example.java.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.library.view.SwipeItemView;

public class MainActivity extends AppCompatActivity {

    private SwipeItemView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView = (SwipeItemView) findViewById(R.id.swipe_item);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mView.dispatchTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
