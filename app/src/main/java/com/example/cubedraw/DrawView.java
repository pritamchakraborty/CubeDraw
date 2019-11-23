package com.example.cubedraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


public class DrawView extends View {

    Paint paint;

    public DrawView(Context c) {
        super(c);
        setFocusable(true);
    }


    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);

        super.onDraw(canvas);

        canvas.drawRect(100, 100, 600, 600, paint);
        canvas.drawRect(200, 200, 800, 800, paint);
        canvas.drawRect(400, 400, 700, 700, paint);
//        canvas.drawRect(800, 800, 900, 900, paint);
       // canvas.drawRect(400, 400, 700, 700, paint);

    }
}