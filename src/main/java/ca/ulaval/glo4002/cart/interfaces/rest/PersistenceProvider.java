package ca.ulaval.glo4002.cart.interfaces.rest;

import ca.ulaval.glo4002.cart.application.cart.CartRepository;

public class PersistenceProvider {
    public static CartRepository getCartRepository() {
        if (System.getProperty("store").equalsIgnoreCase("xml")) {
            // xml
            return new CartRepository(true);
        } else {
            // in memory
            return new CartRepository(false);
        }
    }

    // Idem pour ShopRepository
}
