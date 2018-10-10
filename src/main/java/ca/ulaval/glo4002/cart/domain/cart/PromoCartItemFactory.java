package ca.ulaval.glo4002.cart.domain.cart;

import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

public class PromoCartItemFactory implements CartItemFactory {

    @Override
    public CartItem create(ShopItem item) {
        return new CartItem(item.getName(), 2, item.getPriceWithShipping());
    }
}
