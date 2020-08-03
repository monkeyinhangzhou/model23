package com.cloud.model.build.builder;

/**
 * 建造者实现类
 */
public class HuaweiBuilder extends Builder {

    @Override
    public void addProcessor() {
        phone.setProcessor("i5处理器");
    }

    @Override
    public void addCamera() {
        phone.setCamera("莱卡摄像头");
    }

    @Override
    public void addScreen() {
        phone.setScreen("OLED");
    }
}
