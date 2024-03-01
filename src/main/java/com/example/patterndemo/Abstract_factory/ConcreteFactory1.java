package com.example.patterndemo.Abstract_factory;

import com.example.patterndemo.Abstract_factory.Prod.ProductA;
import com.example.patterndemo.Abstract_factory.Prod.ProductB;
import com.example.patterndemo.Abstract_factory.conc.ConcreteProductA1;
import com.example.patterndemo.Abstract_factory.conc.ConcreteProductB1;
import org.springframework.stereotype.Component;

@Component
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}