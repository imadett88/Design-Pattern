package com.example.patterndemo.Decorator;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Component
public class Decorator implements Component {

    @Autowired
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Decorator operation");
        component.operation();
    }
}