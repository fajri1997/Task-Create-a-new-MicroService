package com.example.Stock.controller;


import com.example.Stock.bo.AccountResponse;
import com.example.Stock.bo.CreateStockRequest;
import com.example.Stock.bo.UpdateStockResponse;
import com.example.Stock.service.StockService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }

    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }


    @GetMapping("/updateAccount")
    public AccountResponse getStockList(){
        return stockService.getAll();
    }


}



