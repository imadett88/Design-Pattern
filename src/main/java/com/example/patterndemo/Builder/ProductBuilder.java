package com.example.patterndemo.Builder;

import org.springframework.stereotype.Component;

@Component
public class ProductBuilder {
    private String part1;
    private String part2;
    private String part3;

    public ProductBuilder setPart1(String part1) {
        this.part1 = part1;
        return this;
    }

    public ProductBuilder setPart2(String part2) {
        this.part2 = part2;
        return this;
    }

    public ProductBuilder setPart3(String part3) {
        this.part3 = part3;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setPart1(this.part1);
        product.setPart2(this.part2);
        product.setPart3(this.part3);
        return product;
    }
}