package com.jianglei.c15_builder.v02_by_self_like_cnblogs;

/**
 * Created by jianglei on 2017/7/10.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.builder();
        Product product = builder.retriveProduct();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
