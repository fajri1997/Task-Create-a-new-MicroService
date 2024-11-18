package com.example.Stock.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "stock")
public class StockEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long quantity;

    @Column
    private String item;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}