package com.cloud.model.build.factory.commonFactory;

import com.cloud.model.build.factory.commonFactory.impl.HuaWeiPhone;
import com.cloud.model.build.factory.commonFactory.impl.VivoPhone;
import com.cloud.model.build.factory.commonFactory.impl.XiaoMiPhone;

public class Factory {

    public static final String XIAO_MI = "XIAO_MI";
    public static final String HUA_WEI = "HUA_WEI";

    public static Phone produce(String type){
        Phone phone;
        if(XIAO_MI.equalsIgnoreCase(type)){
            phone = new XiaoMiPhone();
        } else if(HUA_WEI.equalsIgnoreCase(type)){
            phone = new HuaWeiPhone();
        } else {
            phone = new VivoPhone();
        }
        return phone;
    }

}
