package cn.zjxiliu.jnilearn._native;

import cn.zjxiliu.jnilearn.listener.NativeListener;

public class JNITest {

    static {
        try {
            System.loadLibrary("native-test");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * java调用C++提供的接口
     * @param config
     */
    public static native void init(String config);

    /**
     * java注册C++的回调接口
     * @param listener
     */
    public static native void registerListener(NativeListener listener);



}
