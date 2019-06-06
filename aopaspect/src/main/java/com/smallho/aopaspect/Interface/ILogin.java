package com.smallho.aopaspect.Interface;

import android.content.Context;

/**
 * Created by small-ho on 2019-06-06 16:29
 * title：ILogin接口
 */
public interface ILogin {
    /** 登录事件接收 */
    void login(Context context,int actionDefine);
    /** 判断是否登录 */
    boolean isLogin(Context context);
}
