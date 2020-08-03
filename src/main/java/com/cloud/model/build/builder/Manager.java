package com.cloud.model.build.builder;

/**
 * 管理者类(导演类)
 * 驱使具体构建者按照指定顺序完成构建过程.
 *
 * @see HuaweiBuilder
 * @see XiaomiBuilder
 */
public class Manager {
    private Builder builder;

    public Manager(Builder builder) {
        this.builder = builder;
    }

    public Phone buy() {
        builder.addCamera();
        builder.addProcessor();
        builder.addScreen();
        return builder.produce();
    }
}
