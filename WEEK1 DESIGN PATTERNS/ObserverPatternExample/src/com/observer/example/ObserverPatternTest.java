package com.observer.example;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(105.50);
        stockMarket.setStockPrice(99.75);

        stockMarket.deregisterObserver(mobileApp2);

        stockMarket.setStockPrice(110.25);
    }
}
