package com.cloud.model.build.singleton.lazy;

/**
 * 懒汉模式单例
 * 单线程
 */
public class SuperMan {
    private static SuperMan superMan = null;

    private SuperMan() {

    }

    public static SuperMan getInstance() {
        if (null == superMan) {
            superMan = new SuperMan();
        }
        return superMan;
    }
}
