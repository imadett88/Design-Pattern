package com.example.patterndemo.Abstract_factory;

import com.example.patterndemo.Abstract_factory.Prod.ProductA;
import com.example.patterndemo.Abstract_factory.Prod.ProductB;
import com.example.patterndemo.Abstract_factory.conc.ConcreteProductA2;
import com.example.patterndemo.Abstract_factory.conc.ConcreteProductB2;
import org.springframework.stereotype.Component;

@Component
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}