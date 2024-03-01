package com.example.patterndemo.Factory_Method;

import org.springframework.stereotype.Component;

@Component
public class AnotherConcreteProduct implements Product {
    @Override
    public void operation() {
        System.out.println("Operation in AnotherConcreteProduct");
    }
}
