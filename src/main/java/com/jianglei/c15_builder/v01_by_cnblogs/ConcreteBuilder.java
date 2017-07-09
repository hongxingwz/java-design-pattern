package com.jianglei.c15_builder.v01_by_cnblogs;

/**
 * Created by jianglei on 2017/7/10.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();
    @Override
    public void buildPart1() {
        product.setPart1("No: 9572");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Name: DengYi");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
