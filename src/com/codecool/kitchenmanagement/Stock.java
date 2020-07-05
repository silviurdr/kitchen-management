package com.codecool.kitchenmanagement;

public class Stock {

    private static Stock stock = new Stock();

    private int stockVolume;

    private Stock() {
    }

    public static Stock getStock() {
        return stock;
    }

    public int getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(int stockVolume) {
        this.stockVolume = stockVolume;
    }

}
