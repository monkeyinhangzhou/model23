package com.cloud.model.build.singleton.lazy;

/**
 * 懒汉模式单例
 * 多线程-双重检查锁(缩小锁的范围,提高性能)
 */
public class SuperMan3 {

    private static SuperMan3 instance = null;

    private SuperMan3() {

    }

    public static SuperMan3 getInstance() {
        if (null == instance) {
            synchronized (SuperMan3.class) {
                if (null == instance) {
                    instance = new SuperMan3();
                }
            }
        }
        return instance;
    }
}
