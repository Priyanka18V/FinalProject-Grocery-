package com.example.demo.domain.view;

import java.io.Serializable;

public class ShoppingCartItem implements Serializable {

    private static final long serialVersionUID = 8159650484411742891L;
	private OrderProductViewModel product;
    private int quantity;

    public ShoppingCartItem() {
    }

    public OrderProductViewModel getProduct() {
        return this.product;
    }

    public void setProduct(OrderProductViewModel product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
