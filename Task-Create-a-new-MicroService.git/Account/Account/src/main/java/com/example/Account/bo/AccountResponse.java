package com.example.Account.bo;

import java.util.List;

public class AccountResponse {


    private List<Stock> stockList;

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }
}
