package ca.ulaval.glo4002.cart.interfaces.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopItemDto {
    @JsonProperty
    public String itemSku;

    @JsonProperty
    public String name;

    ShopItemDto(String sku, String name) {
        itemSku = sku;
        this.name = name;
    }
}
