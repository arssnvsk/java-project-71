package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println(App.getProtocol("https://google.com"));
    }
    public static String getProtocol(String url) {
        String[] splited = url.split(":");
        return splited[0];
    }
}