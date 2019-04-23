package com.design.pattern.singleton;

/**
 * The hungry man model
 *
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class SingletonV1 {
    private static SingletonV1 singletonV1 = new SingletonV1();

    private SingletonV1() {

    }

    public static SingletonV1 getInstance() {
        return singletonV1;
    }

}
