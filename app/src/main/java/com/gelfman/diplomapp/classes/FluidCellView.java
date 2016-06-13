package com.gelfman.diplomapp.classes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Admin on 24.05.2016.
 */
public class FluidCellView extends ImageView {
    public FluidCellView(Context context) {
        super(context);
    }

    public FluidCellView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FluidCellView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
