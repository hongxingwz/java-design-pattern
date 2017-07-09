package com.jianglei.c15_builder.v04_insurance_contract;

import org.junit.Test;

/**
 * Created by jianglei on 17-7-10.
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("1", 2, 3);
        InsuranceContract contract = builder.setPersonName("dengyi")
                .setOtherData("I love dengyi")
                .build();

        System.out.println(contract);
    }
}
