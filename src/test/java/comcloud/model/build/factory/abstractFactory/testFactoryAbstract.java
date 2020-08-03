package comcloud.model.build.factory.abstractFactory;

import com.cloud.model.build.factory.abstractFactory.Factory;
import com.cloud.model.build.factory.abstractFactory.Phone;
import com.cloud.model.build.factory.abstractFactory.impl.HuaWeiFactory;
import com.cloud.model.build.factory.abstractFactory.impl.VivoFactory;

public class testFactoryAbstract {

    /**
     * 抽象工厂方法,可满足产品族问题,比如不同品牌的东西,扩展的话只需要新增对应的工厂去实现工厂接口,
     * 满足开闭原则:对扩展开放,对修改关闭.
     * @param args
     */
    public static void main(String[] args) {
        Factory factory = new HuaWeiFactory();
        Phone produce = factory.produce();
        produce.call();
        factory = new VivoFactory();
        produce = factory.produce();
        produce.call();
    }

}
