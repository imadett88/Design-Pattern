package com.example.patterndemo.Singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private static SingletonBean instance;

    private SingletonBean() {}

    public static SingletonBean getInstance() {
        if (instance == null) {
            instance = new SingletonBean();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from SingletonBean!");
    }
}

