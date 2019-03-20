package com.lwl.strategy.stock;

import java.util.HashMap;

public class StockManageService {
    public static final  String ENTER_STOCK = "enter_stock";
    public static final  String OUTPUT_STOCK = "output_stock";
    public static final  String ALLOT_STOCK = "allot_stock";
    private  static final HashMap<String, StockStrategy> stockServiceMapping = new HashMap();
    static{
        stockServiceMapping.put(ENTER_STOCK,new EneterStockSrevice());
        stockServiceMapping.put(OUTPUT_STOCK,new OutputStockService());
        stockServiceMapping.put(ALLOT_STOCK,new OutputStockService());
    }
    public void increaseStock(String type ,int count) {
        stockServiceMapping.get(type).increaseStock(count);
    }

    public void decreaseStock(String type,int count) {
        stockServiceMapping.get(type).decreaseStock(count);

    }
}
