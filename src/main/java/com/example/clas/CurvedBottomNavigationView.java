package com.example.clas;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class CurvedBottomNavigationView extends BottomNavigationView {

    private Path mPath;
    private Paint mPaint;


    public Point mFirstCurveStartPoint = new Point();
    public Point mFirstCurveEndPoint = new Point();
    public Point mFirstControlPoint1 = new Point();
    public Point mFirstControlPoint2 = new Point();

    public Point mSecondCurveStartPoint = new Point();
    public Point mSecondCurveEndPoint = new Point();
    public Point mSecondControlPoint1 = new Point();
    public Point mSecondControlPoint2 = new Point();

    private int mNavigationBarWidth,mNavigationBarHeigth;





    public CurvedBottomNavigationView(Context context) {
        super(context);
        initView();
    }

    public CurvedBottomNavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CurvedBottomNavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    private void initView() {
        mPath = new Path();
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(Color.WHITE);
        setBackgroundColor(Color.TRANSPARENT);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mNavigationBarWidth = getWidth();
        mNavigationBarHeigth = getHeight();
        mFirstCurveStartPoint.set((mNavigationBarHeigth/2)-(CURVE_CIRCLE_RADIUS*2)-(CURVE_CIRCLE_RADIUS/3),0);
    }
}
