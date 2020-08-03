package com.cloud.model.build.singleton;

import com.cloud.model.build.singleton.enumsingleton.EnumSuperMan4;
import com.cloud.model.build.singleton.hunger.King;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class testKing {

    /**
     * 序列化破坏单例结构
     *
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws Exception {
        King kingOld = King.getInstance();

        // TODO 序列化破坏单例
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("king"));
        out.writeObject(kingOld);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("king"));
        King kingNew = (King) in.readObject();
        System.out.println(kingOld);
        System.out.println("序列化破坏单例:\n\r" + kingNew);
        //单例对象的地址不同; 单例中增加readResolve()方法可以防止

        // TODO 反射破坏单例
        Class<King> clazz = King.class;
        Constructor<King> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        King king = declaredConstructor.newInstance();
        System.out.println("反射破坏单例:\n\r" + king);
        //饿汉模式可以在私有构造方法内加判断避免,但是懒汉模式无法解决此问题


        EnumSuperMan4 instance = EnumSuperMan4.INSTANCE;
        //枚举的单例不支持反射创建对象
        //java.lang.NoSuchMethodException: com.cloud.model.build.singleton.enumsingleton.EnumSuperMan4
//        Class<EnumSuperMan4> enumSuper = EnumSuperMan4.class;
//        Constructor<EnumSuperMan4> declaredConstructor1 = enumSuper.getDeclaredConstructor();
//        declaredConstructor1.setAccessible(true);
//        King king1 = declaredConstructor.newInstance();
//        System.out.println(king1);
        // 序列化也不可破坏枚举单例
        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("enumSuper"));
        out2.writeObject(instance);
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("enumSuper"));
        EnumSuperMan4 enumSuperMan4 = (EnumSuperMan4) in2.readObject();
        System.out.println(instance);// INSTANCE
        System.out.println("序列化破坏单例:\n\r" + enumSuperMan4);// INSTANCE

    }

}
