package com.example.android101.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/** An image view which stays square with respect to its width. */
public class SquaredImageView extends ImageView {
  public SquaredImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    // Get the width the view wants to be...
    int width = MeasureSpec.getSize(widthMeasureSpec);
    // ...and use it for both the width and height.
    setMeasuredDimension(width, width);
  }
}
