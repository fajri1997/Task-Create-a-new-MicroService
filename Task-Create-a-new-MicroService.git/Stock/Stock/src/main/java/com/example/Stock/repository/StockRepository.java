package com.example.Stock.repository;


import com.example.Stock.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockRepository extends CrudRepository<StockEntity, Long> {

    Iterable<StockEntity> findByItem(String item);
    //StockEntity findByItem(String item);

}