package cn.zjxiliu.jnilearn.open;


import cn.zjxiliu.jnilearn.BuildConfig;

/**
 * java端开放给C++使用的方法
 */
public class JavaFuncs2CUtils {

    public static String getApplicationID(){
        return BuildConfig.APPLICATION_ID;
    }


}
