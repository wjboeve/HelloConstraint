package com.example.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mZeroOut;
    private Button mEvenOdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mZeroOut = (Button) findViewById(R.id.button_zero);
        mEvenOdd = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        if(mCount == 0) {
            mZeroOut.setBackgroundColor(Color.MAGENTA);
        }
        mCount++;
        if(mCount%2 == 0) {
            mEvenOdd.setBackgroundColor(Color.BLUE);
        }
        if(mCount%2 == 1) {
            mEvenOdd.setBackgroundColor(Color.GREEN);
        }
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void reset(View view) {
        mCount = 0;
        mZeroOut.setBackgroundColor(Color.LTGRAY);
        mEvenOdd.setBackgroundColor(Color.BLUE);
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
