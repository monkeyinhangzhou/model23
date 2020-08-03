package com.cloud.model.build.singleton.hunger;

import java.io.Serializable;

/**
 * 饿汉模式单例
 * 匿名内部类方式
 */
public class King2 implements Serializable {
    private static final long serialVersionUID = -7042500118152869270L;

    private King2() {
    }

    //静态内部类
    private static class InnerClass {
        private static final King2 k2 = new King2();

    }

    public static final King2 getInstance() {
        return InnerClass.k2;
    }

    public King2 readResolve() {
        return InnerClass.k2;
    }
}
