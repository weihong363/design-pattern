package com.ironion.nullobject;

/**
 * @author ironion
 * @date 2022/6/25 11:20
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Theres no available customer name";
    }

    @Override
    public Boolean isNil() {
        return true;
    }
}
