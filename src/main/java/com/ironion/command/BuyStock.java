package com.ironion.command;

/**
 * @author ironion
 * @date 2022/6/16 19:05
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
