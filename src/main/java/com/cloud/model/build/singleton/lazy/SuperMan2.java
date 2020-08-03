package com.cloud.model.build.singleton.lazy;

/**
 * 懒汉模式单例
 * 多线程-使用synchronized关键字
 */
public class SuperMan2 {
    private static SuperMan2 instance = null;

    private SuperMan2() {

    }

    public static synchronized SuperMan2 getInstance() {
        if (null == instance) {
            instance = new SuperMan2();
        }
        return instance;
    }
}
