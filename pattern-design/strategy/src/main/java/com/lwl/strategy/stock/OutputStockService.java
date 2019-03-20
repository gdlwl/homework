package com.lwl.strategy.stock;

public class OutputStockService implements StockStrategy {
    @Override
    public void increaseStock(int count) {
        System.out.println("取消材料出库"+count);
    }

    @Override
    public void decreaseStock(int count) {
        System.out.println("材料出库"+count);
    }
}
