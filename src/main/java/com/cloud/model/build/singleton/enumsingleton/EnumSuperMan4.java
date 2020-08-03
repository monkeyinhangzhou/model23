package com.cloud.model.build.singleton.enumsingleton;

/**
 * 推荐的写法,可以避免反射和序列化的破坏
 */
public enum EnumSuperMan4 {
    INSTANCE;
    private Object data;

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSuperMan4 getInstance() {
        return INSTANCE;
    }
}
