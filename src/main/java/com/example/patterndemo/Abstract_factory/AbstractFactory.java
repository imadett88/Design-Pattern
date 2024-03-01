package com.example.patterndemo.Abstract_factory;

import com.example.patterndemo.Abstract_factory.Prod.ProductA;
import com.example.patterndemo.Abstract_factory.Prod.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}