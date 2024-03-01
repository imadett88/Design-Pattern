package com.example.patterndemo.Decorator;

@org.springframework.stereotype.Component
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}
