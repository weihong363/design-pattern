package com.ironion.nullobject;

/**
 * @author ironion
 * @date 2022/6/25 11:24
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        AbstractCustomer customer1 = customerFactory.getCustomer(null);
        System.out.println(String.format("customer name: %s",customer1.getName()));
        System.out.println(String.format("customer is null ? %s",customer1.isNil()));
        AbstractCustomer customer2 = customerFactory.getCustomer("张三");
        System.out.println(String.format("customer name: %s",customer2.getName()));
        System.out.println(String.format("customer is null ? %s",customer2.isNil()));
    }
}
