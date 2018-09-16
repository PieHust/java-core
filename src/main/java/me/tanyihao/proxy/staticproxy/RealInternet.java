package me.tanyihao.proxy.staticproxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String hostname) {
        System.out.println("Connecting to " + hostname + " ......");
        System.out.println("You have successed to connect " + hostname);
    }
}
