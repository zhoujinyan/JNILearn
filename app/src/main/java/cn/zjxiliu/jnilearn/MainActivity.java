package cn.zjxiliu.jnilearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import cn.zjxiliu.jnilearn._native.JNITest;
import cn.zjxiliu.jnilearn.listener.NativeListener;

public class MainActivity extends AppCompatActivity implements NativeListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNITest.registerListener(this);

        JNITest.init("asdasda");

    }


    @Override
    public void showLog(int level, String msg) {
        Log.i(TAG, msg);
    }
}
