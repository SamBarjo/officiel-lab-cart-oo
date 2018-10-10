package ca.ulaval.glo4002.cart.domain.cart;

import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

public class RegularCartItemFactory implements CartItemFactory {

    @Override
    public CartItem create(ShopItem item) {
        return new CartItem(item.getName(), 1, item.getPriceWithShipping());
    }
}
