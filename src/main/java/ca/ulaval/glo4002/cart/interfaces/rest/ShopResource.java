package ca.ulaval.glo4002.cart.interfaces.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ca.ulaval.glo4002.cart.application.shop.ShopApplicationService;
import ca.ulaval.glo4002.cart.domain.shop.ShopItem;
import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;

@Path("/shop")
public class ShopResource {

    private ShopApplicationService shopService;

    public ShopResource() {
        this.shopService = new ShopApplicationService();
    }

    @GET
    @Path("/available-items")
    public List<ShopItemDto> listItems() {
        List<ShopItem> items = shopService.listAvailableItems();

        List<ShopItemDto> itemDtos = new ArrayList<>();
        ShopItemDtoAssembler assembler = new ShopItemDtoAssembler();
        for (ShopItem item : items) {
            itemDtos.add(assembler.toDto(item));
        }

        return itemDtos;
    }
}
