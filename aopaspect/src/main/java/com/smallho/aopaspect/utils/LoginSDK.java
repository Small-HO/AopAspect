package com.smallho.aopaspect.utils;

import android.annotation.SuppressLint;
import android.content.Context;

import com.smallho.aopaspect.Interface.ILogin;

/**
 * Created by small-ho on 2019-06-06 16:31
 * title：LoginSDK类
 */
public class LoginSDK {
    private ILogin login;
    private Context context;
    @SuppressLint("StaticFieldLeak")
    private static LoginSDK instance;

    private LoginSDK() {}

    public void init(Context context,ILogin iLogin) {
        this.context = context;
        this.login = iLogin;
    }

    public static LoginSDK getInstance() {
        if (instance == null) {
            synchronized (LoginSDK.class) {
                if (instance == null) {
                    instance = new LoginSDK();
                }
            }
        }
        return instance;
    }

    public ILogin getLogin() {
        return login;
    }

    public Context getContext() {
        return context;
    }
}
