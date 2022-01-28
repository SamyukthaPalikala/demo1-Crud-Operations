package com.CrudOperations.demo1CrudOperations.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private String id;
    private String name;
    private int price;
    private long barcode;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public long getBarcode() {

        return barcode;
    }

    public void setBarcode(long barcode) {

        this.barcode = barcode;
    }

    public Product() {
    }

    public Product(String id , String name, int price, long barcode) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }
}
