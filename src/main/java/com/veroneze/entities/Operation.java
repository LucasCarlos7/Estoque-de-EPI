package com.veroneze.entities;

import java.time.LocalDate;

public class Operation {
    
    private String operation;
    private Integer amount;
    private LocalDate date;
    private Product product;
    
    public Operation() {
    }
    
    public Operation(String operation, Integer amount, LocalDate date, Product product) {
        this.operation = operation;
        this.amount = amount;
        this.date = date;
        this.product = product;
    }
    
    public String getOperation() {
        return operation;
    }
    
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public Integer getAmount() {
        return amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
}
