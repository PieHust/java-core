package me.tanyihao.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new FakeInternetProxy();
        internet.connectTo("www.google.com");
        internet.connectTo("www.baidu.com");
    }
}
