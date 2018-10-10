package ca.ulaval.glo4002.cart.interfaces.rest;

import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

public class ShopItemDtoAssembler {

    public ShopItemDto toDto(ShopItem item) {
        return new ShopItemDto(item.getSku(), item.getName());
    }
}
