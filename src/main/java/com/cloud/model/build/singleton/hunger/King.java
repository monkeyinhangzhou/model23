package com.cloud.model.build.singleton.hunger;

import java.io.Serializable;

/**
 * 饿汉式单例
 * 优点:
 * 饿汉式不存在线程安全问题,对象唯一性由虚拟机在类初始化创建时保证.
 * 缺点:
 * 如果对象耗费资源时,并且不一定被使用时就会造成资源浪费.
 * <br/>
 * 静态代码块方式的
 */
public class King implements Serializable {

    private static final long serialVersionUID = 7094158771178179549L;
    private static final King instance;

    static {
        instance = new King();
    }

    private King() {
        if (null != instance) {
//            throw new RuntimeException("不允许反射创建单例对象");
        }

    }

    public static King getInstance() {
        return instance;
    }

    /**
     * 此方法可防止序列化破坏单例
     * @return
     */
//    public Object readResolve(){
//        return instance;
//    }

}
