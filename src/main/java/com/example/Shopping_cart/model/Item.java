package com.example.Shopping_cart.model;

@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;

    public Integer getProductId() { return productId; }

    public void setProductId(Integer productId) { this.productId = productId; }

    public Integer getAnount() {return amount; }

    public void setAmount(Integer amount) { this.amount = amount; }

}
