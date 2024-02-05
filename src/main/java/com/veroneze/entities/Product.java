package com.veroneze.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(name = "number_size")
    private String numberSize;
    private Integer amount;
    private String detail;
    private ProductType productType;

    public Product() {
    }

    public Product(Integer id, String name, String numberSize, Integer amount, String detail, ProductType productType) {
        this.id = id;
        this.name = name;
        this.numberSize = numberSize;
        this.amount = amount;
        this.detail = detail;
        this.productType = productType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberSize() {
        return numberSize;
    }

    public void setNumberSize(String numberSize) {
        this.numberSize = numberSize;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", numberSize=" + numberSize + ", amount=" + amount + ", detail=" + detail + '}';
    }
}
