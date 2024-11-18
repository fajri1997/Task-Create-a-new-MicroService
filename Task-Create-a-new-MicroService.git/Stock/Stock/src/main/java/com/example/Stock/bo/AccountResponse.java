package com.example.Stock.bo;

import com.example.Stock.entity.StockEntity;

import java.util.List;

public class AccountResponse  {

  private List<StockEntity> stockList;

    public List<StockEntity> getStockList() {
        return stockList;
    }

    public void setStockList(List<StockEntity> stockList) {
        this.stockList = stockList;
    }

    public AccountResponse(List<StockEntity> stockList) {
        this.stockList = stockList;
    }
}
