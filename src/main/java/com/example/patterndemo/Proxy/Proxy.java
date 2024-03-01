package com.example.patterndemo.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Proxy implements Subject {

    @Autowired
    private RealSubject realSubject;

    @Override
    public void request() {
        System.out.println("Proxy handles request.");
        realSubject.request();
    }
}