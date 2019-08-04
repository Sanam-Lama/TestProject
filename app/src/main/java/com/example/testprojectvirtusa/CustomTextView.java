package com.example.testprojectvirtusa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


@SuppressLint("AppCompatCustomView")
public class CustomTextView extends TextView{
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
