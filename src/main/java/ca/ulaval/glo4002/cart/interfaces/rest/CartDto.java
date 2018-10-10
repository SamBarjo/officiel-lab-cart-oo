package ca.ulaval.glo4002.cart.interfaces.rest;

import java.util.List;

public class CartDto {
    public List<CartItemDto> items;

    public CartDto(List<CartItemDto> items) {
        this.items = items;
    }
}
