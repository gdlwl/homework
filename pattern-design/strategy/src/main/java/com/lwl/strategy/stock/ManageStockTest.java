package com.lwl.strategy.stock;

public class ManageStockTest {
    public static void main(String[] args) {
        new StockManageService().increaseStock(StockManageService.ENTER_STOCK,100);
        new StockManageService().decreaseStock(StockManageService.ENTER_STOCK,100);
    }
}
