package com.jianglei.c15_builder.v02_by_self_like_cnblogs;

/**
 * Created by jianglei on 2017/7/10.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();


    @Override
    public void builderPart1() {
        product.setPart1("Name: DengYi");
    }

    @Override
    public void builderPart2() {
        product.setPart2("No.: 1");
    }

    public Product retriveProduct() {
        return product;
    }
}
