package com.design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/23
 */
public class SingletonTest {
    @Test
    public void testV1() {
        SingletonV1 singletonV1 = SingletonV1.getInstance();
        SingletonV1 singletonV12 = SingletonV1.getInstance();
        Assert.assertEquals(singletonV1, singletonV12);
    }

    @Test
    public void testV2() {
        SingletonV2 singletonV2 = SingletonV2.getInstance();
        SingletonV2 singletonV22 = SingletonV2.getInstance();
        Assert.assertEquals(singletonV2, singletonV22);
    }

    @Test
    public void testV3() {
        SingletonV3 singletonV3 = SingletonV3.getInstance();
        SingletonV3 singletonV32 = SingletonV3.getInstance();
        Assert.assertEquals(singletonV3, singletonV32);
    }

    @Test
    public void testV4() {
        SingletonV4 singletonV4 = SingletonV4.getInstance();
        SingletonV4 singletonV42 = SingletonV4.getInstance();
        Assert.assertEquals(singletonV4, singletonV42);
    }

    @Test
    public void testV5() {
        SingletonV5 singletonV5 = SingletonV5.SINGLETON_V_5;
        SingletonV5 singletonV52 = SingletonV5.SINGLETON_V_5;
        Assert.assertEquals(singletonV5, singletonV52);
    }
}
