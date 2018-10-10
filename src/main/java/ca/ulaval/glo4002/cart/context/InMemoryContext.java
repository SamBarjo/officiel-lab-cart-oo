package ca.ulaval.glo4002.cart.context;

import ca.ulaval.glo4002.cart.application.ServiceLocator;
import ca.ulaval.glo4002.cart.domain.cart.CartRepository;
import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;
import ca.ulaval.glo4002.cart.infrastructure.persistence.memory.InMemoryCartRepository;
import ca.ulaval.glo4002.cart.infrastructure.persistence.memory.InMemoryShopRepository;

public class InMemoryContext {

    public void apply() {
        ServiceLocator.INSTANCE.register(CartRepository.class, new InMemoryCartRepository());
        ServiceLocator.INSTANCE.register(ShopRepository.class, new InMemoryShopRepository());
    }
}
