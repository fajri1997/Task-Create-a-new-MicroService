package com.example.Stock.service;

import com.example.Stock.bo.AccountResponse;
import com.example.Stock.bo.CreateStockRequest;
import com.example.Stock.bo.UpdateStockResponse;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);

    AccountResponse getAll();
}