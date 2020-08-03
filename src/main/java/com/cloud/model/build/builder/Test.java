package com.cloud.model.build.builder;

public class Test {

    /**
     * 建造者模式
     * 建造者模式的优点在于将复杂的构建过程拆分为多个独立的单元，
     * 在保证拓展性的基础上也保证了良好的封装性，使得客户端不必知道产品的具体创建流程。
     *
     * @param args
     */
    public static void main(String[] args) {
        Phone huawei = new Manager(new HuaweiBuilder()).buy();
        Phone xiaomi = new Manager(new XiaomiBuilder()).buy();
        System.out.println(huawei);
        System.out.println(xiaomi);

    }
}
