package com.smallho.aopaspect.Interface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by small-ho on 2019-06-06 16:30
 * title：利用注解来切点标示方法，作用在运行期
 */
@SuppressWarnings("CheckStyle")
@Target(ElementType.METHOD) //可以注解在方法 上
@Retention(RetentionPolicy.RUNTIME) //运行时（执行时）存在
public @interface LoginIntercept {
    int actionDefine() default 0;
}
