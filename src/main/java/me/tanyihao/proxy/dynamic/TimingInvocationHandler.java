package me.tanyihao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimingInvocationHandler implements InvocationHandler {

    private Object target;

    TimingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.nanoTime();
        Object result = method.invoke(target, args);
        long duration = System.nanoTime() -startTime;

        System.out.println("Executing " + method.getName() + " finished in " + duration + " ns");
        return result;
    }
}
