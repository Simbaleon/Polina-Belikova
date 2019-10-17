package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Dz1_7_6 extends View {
    public Dz1_7_6(Context context) {
        super(context);
    }

    @Override

    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        int y = 0;
        while (y < canvas.getHeight()){
            canvas.drawLine(0, y, this.getWidth(), y, paint);
            y += 10;
        }
    }
}


