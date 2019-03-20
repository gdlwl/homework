package com.lwl.strategy.stock;

public interface StockStrategy {
    /**
     * 增加库存
     */
    void increaseStock(int count);

    /**
     * 减少库存
     */
    void decreaseStock(int count);
}
