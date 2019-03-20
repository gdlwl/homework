package com.lwl.strategy.stock;

public class AllotStockService implements StockStrategy {
    @Override
    public void increaseStock(int count) {
        System.out.println("材料调入"+count);
    }

    @Override
    public void decreaseStock(int count) {
        System.out.println("材料调出"+count);
    }
}
