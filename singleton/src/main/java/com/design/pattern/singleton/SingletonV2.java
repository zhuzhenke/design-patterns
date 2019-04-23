package com.design.pattern.singleton;

/**
 * lazy-load
 *
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class SingletonV2 {
    private SingletonV2() {

    }

    public static SingletonV2 getInstance() {
        return SingletonHolder.SINGLETON_V2;
    }


    private static class SingletonHolder {
        private static final SingletonV2 SINGLETON_V2 = new SingletonV2();
    }
}
