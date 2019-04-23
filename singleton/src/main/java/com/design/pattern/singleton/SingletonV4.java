package com.design.pattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * use cas ,AtomicReference
 *
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class SingletonV4 {

    private static final AtomicReference<SingletonV4> atomicReference = new AtomicReference<>();

    private SingletonV4() {

    }

    public static SingletonV4 getInstance() {
        if (atomicReference.get() == null) {
            atomicReference.compareAndSet(null, new SingletonV4());
        }
        return atomicReference.get();
    }
}
