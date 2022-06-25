package com.ironion.nullobject;

/**
 * @author ironion
 * @date 2022/6/25 11:17
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Boolean isNil() {
        return false;
    }
}
