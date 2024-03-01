package com.example.patterndemo.Factory_Method;

import org.springframework.stereotype.Component;

@Component
public class ConcreteProduct implements Product {
    @Override
    public void operation() {
        System.out.println("Operation in ConcreteProduct");
    }
}