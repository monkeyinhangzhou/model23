package com.cloud.model.build.builder;

/**
 * 建造者实现类
 */
public class XiaomiBuilder extends Builder {
    @Override
    public void addProcessor() {
        phone.setProcessor("骁龙处理器");
    }

    @Override
    public void addCamera() {
        phone.setCamera("索尼摄像头");
    }

    @Override
    public void addScreen() {
        phone.setScreen("OLED");
    }
}
