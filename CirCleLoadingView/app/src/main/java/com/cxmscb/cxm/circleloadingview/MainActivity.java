package com.cxmscb.cxm.circleloadingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    CircleLoadingView circleLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleLoadingView = (CircleLoadingView) findViewById(R.id.clv);
        circleLoadingView.setDuration(4000);
        circleLoadingView.setRadius((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,10,getResources().getDisplayMetrics()));
        circleLoadingView.setColors(new int[]{0xB026c8d3,0xB0d6a802});
    }
}
