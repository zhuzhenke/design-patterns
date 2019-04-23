package com.design.pattern.singleton;

/**
 * use double-check-lock
 *
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class SingletonV3 {

    private SingletonV3() {

    }

    private static SingletonV3 singletonV3;

    private static final Object LOCK = new Object();

    public static SingletonV3 getInstance() {
        if (singletonV3 == null) {
            synchronized (LOCK) {
                if (singletonV3 == null) {
                    singletonV3 = new SingletonV3();
                }
            }
        }
        return singletonV3;
    }
}
