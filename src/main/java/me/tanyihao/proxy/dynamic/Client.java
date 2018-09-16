package me.tanyihao.proxy.dynamic;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map mapProxy = (Map) Proxy.newProxyInstance(
                Client.class.getClassLoader(),
                new Class[] {Map.class},
                new TimingInvocationHandler(new HashMap<String, String>())
        );
        mapProxy.put("test", "test");
        mapProxy.get("test");
        mapProxy.put("hello", "world");
        mapProxy.put("hello1", "world1");

    }
}
