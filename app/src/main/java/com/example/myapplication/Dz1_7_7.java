package com.example.myapplication;

import android.content.Context;
import android.graphics.*;
import android.view.View;

public class Dz1_7_7 extends View {
    public Dz1_7_7(Context context) {
        super(context);
    }

    @Override

    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        int y = -700;
        while (y < canvas.getHeight()) {
            canvas.drawLine(0, y, canvas.getWidth(), y+ 700, paint);
            y += 50;
        }
    }
}
