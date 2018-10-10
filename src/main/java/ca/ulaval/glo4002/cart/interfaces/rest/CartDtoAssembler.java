package ca.ulaval.glo4002.cart.interfaces.rest;

import ca.ulaval.glo4002.cart.domain.cart.Cart;
import ca.ulaval.glo4002.cart.domain.cart.CartItem;

import java.util.ArrayList;
import java.util.List;

public class CartDtoAssembler {

    public CartDto toDto(Cart cart) {
        List<CartItem> items = cart.getItems();

        List<CartItemDto> itemDtos = new ArrayList<>();
        for (CartItem item : items) {
            itemDtos.add(toDto(item));
        }

        return new CartDto(itemDtos);
    }

    public CartItemDto toDto(CartItem item) {
        return new CartItemDto(item.getName(), item.getQuantity(), item.getTotalPrice());
    }
}
