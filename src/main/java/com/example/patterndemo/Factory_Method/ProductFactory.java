package com.example.patterndemo.Factory_Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductFactory {

    @Autowired
    private ConcreteProduct concreteProduct;

    @Autowired
    private AnotherConcreteProduct anotherConcreteProduct;

    public Product createProduct(boolean condition) {
        if (condition) {
            return concreteProduct;
        } else {
            return anotherConcreteProduct;
        }
    }
}
