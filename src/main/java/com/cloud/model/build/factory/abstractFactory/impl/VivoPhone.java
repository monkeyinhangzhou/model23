package com.cloud.model.build.factory.abstractFactory.impl;

import com.cloud.model.build.factory.abstractFactory.Phone;

public class VivoPhone implements Phone {

    public void call() {
        System.out.println("this is vivo.");
    }
}
