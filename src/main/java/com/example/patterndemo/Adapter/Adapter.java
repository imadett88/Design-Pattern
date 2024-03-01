package com.example.patterndemo.Adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Adapter implements Target {

    @Autowired
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
