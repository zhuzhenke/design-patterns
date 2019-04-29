package com.design.pattern.proxy;

import com.design.pattern.proxy.staticproxy.Intermediary;
import com.design.pattern.proxy.staticproxy.Landlord;
import com.design.pattern.proxy.staticproxy.RentTheHouse;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhuzhenke
 * @date 2019/4/29
 */
public class ProxyTest {
    @Test
    public void testCustomerRentHouse() {
        new Intermediary(new Landlord()).rent();
    }

    /**
     * 动态代理：不需要对每个真实执行类创建一个代理执行类，只需要在用到的时候动态创建，这就是动态代理
     */
    @Test
    public void testDynamicProxy() {
        Landlord landlord = new Landlord();

        RentTheHouse landlordProxy = (RentTheHouse) Proxy.newProxyInstance(RentTheHouse.class.getClassLoader(), new Class[]{RentTheHouse.class}, (Object proxy, Method method, Object[] args) -> {
            System.out.println("I am landlord proxy, I am dynamic proxy");
            return method.invoke(landlord, args);
        });
        landlordProxy.rent();
    }
}
