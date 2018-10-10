package ca.ulaval.glo4002.cart.interfaces.rest;

public class CartItemDto {
    public String name;

    public int quantity;

    public int totalPrice;

    public CartItemDto(String name, int quantity, int totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
}
