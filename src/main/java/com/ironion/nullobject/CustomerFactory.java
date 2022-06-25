package com.ironion.nullobject;

/**
 * @author ironion
 * @date 2022/6/25 11:21
 */
public class CustomerFactory {

    public AbstractCustomer getCustomer(String name){
        if (null == name){
            return new NullCustomer();
        }
        return new RealCustomer(name);
    }
}
