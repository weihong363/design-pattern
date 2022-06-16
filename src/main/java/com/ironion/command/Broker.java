package com.ironion.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ironion
 * @date 2022/6/16 19:08
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    void takeOrder(Order order){
        orders.add(order);
    }

    void placeOrders(){
        // 遍历去执行一遍
        orders.forEach(order -> {
            order.execute();
        });
        // 清空
        orders.clear();
    }
}
