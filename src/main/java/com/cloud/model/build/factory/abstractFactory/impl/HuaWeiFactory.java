package com.cloud.model.build.factory.abstractFactory.impl;

import com.cloud.model.build.factory.abstractFactory.Factory;
import com.cloud.model.build.factory.abstractFactory.Phone;

public class HuaWeiFactory implements Factory {
    public Phone produce() {
        return new HuaWeiPhone();
    }
}
