package com.veroneze.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String operation;
    private Integer amount;
    private LocalDate date;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
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
