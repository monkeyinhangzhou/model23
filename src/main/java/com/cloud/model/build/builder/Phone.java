package com.cloud.model.build.builder;

/**
 * 产品实体类
 */
public class Phone {
    //    处理器
    private String processor;
    //    屏幕
    private String camera;
    //    摄像头
    private String screen;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "processor='" + processor + '\'' +
                ", camera='" + camera + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
