package com.example.patterndemo.Builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDirector {
    @Autowired
    private ProductBuilder productBuilder;

    public Product constructProduct() {
        return productBuilder
                .setPart1("Part 1")
                .setPart2("Part 2")
                .setPart3("Part 3")
                .build();
    }
}
