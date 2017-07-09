package com.jianglei.c15_builder.v01_by_cnblogs;

/**
 * Created by jianglei on 2017/7/10.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.constructor();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
