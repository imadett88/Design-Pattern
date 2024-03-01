package com.example.patterndemo.Proxy;

import org.springframework.stereotype.Component;

@Component
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject handles request.");
    }
}
