package me.tanyihao.proxy.staticproxy;

import java.util.ArrayList;
import java.util.List;

public class FakeInternetProxy implements Internet {

    private Internet internet = new RealInternet();

    private static List<String> banList;

    static {
        banList = new ArrayList<>();
        banList.add("www.google.com");
        banList.add("www.facebook.com");
        banList.add("www.youtube.com");
    }

    @Override
    public void connectTo(String hostname) {
        if (banList.contains(hostname)) {
            System.out.println("404 page not found");
        } else {
            System.out.println("Welcome to the real internet!");
            internet.connectTo(hostname);
        }

    }
}
