package comcloud.model.build.factory.commonFactory;


import com.cloud.model.build.factory.commonFactory.Factory;
import com.cloud.model.build.factory.commonFactory.Phone;

public class testFactoryCommon {

    /**
     * 普通工厂模式
     * 类创建需要依赖工厂类,扩展时需要对工厂类进行修改,违背开闭原则
     * 需要抽象工厂模式解决这个问题.
     * @param args
     */
    public static void main(String[] args) {
        Phone produce = Factory.produce(Factory.HUA_WEI);
        produce.call();
        produce = Factory.produce(Factory.XIAO_MI);
        produce.call();
    }
}
