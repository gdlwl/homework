package com.lwl.strategy.stock;

public class EneterStockSrevice implements StockStrategy {
    @Override
    public void increaseStock(int count) {
        System.out.println("材料入库"+count);
    }

    @Override
    public void decreaseStock(int count) {
        System.out.println("取消入库"+count);
    }
}
