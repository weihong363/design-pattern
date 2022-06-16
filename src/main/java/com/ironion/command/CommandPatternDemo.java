package com.ironion.command;

/**
 * @author ironion
 * @date 2022/6/16 19:14
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Broker broker = new Broker();
        Stock stock = new Stock();
        BuyStock buy = new BuyStock(stock);
        broker.takeOrder(buy);
        broker.takeOrder(buy);
        SellStock sell = new SellStock(stock);
        broker.takeOrder(sell);
        broker.placeOrders();
    }
}
