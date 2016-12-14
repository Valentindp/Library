package com.example.library.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by java on 14.12.2016.
 */

public class SwipeItemView extends FrameLayout {

    public SwipeItemView(Context context) {
        super(context);
    }

    public SwipeItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SwipeItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SwipeItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                Log.d(SwipeItemView.class.getSimpleName(), "down");
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                Log.d(SwipeItemView.class.getSimpleName(), "move");
                break;
            }
            case MotionEvent.ACTION_UP: {
                Log.d(SwipeItemView.class.getSimpleName(), "up");
                break;
            }
        }
        return super.dispatchTouchEvent(ev);
    }
}