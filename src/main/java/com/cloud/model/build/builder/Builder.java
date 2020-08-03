package com.cloud.model.build.builder;

/**
 * 建造者抽象类
 */
public abstract class Builder {
    /**
     * protected传给继承者用
     */
    protected Phone phone = new Phone();

    /**
     * 安装处理器
     */
    public abstract void addProcessor();

    /**
     * 组装摄像头
     */
    public abstract void addCamera();

    /**
     * 安装屏幕
     */
    public abstract void addScreen();

    public Phone produce() {
        return phone;
    }

}
