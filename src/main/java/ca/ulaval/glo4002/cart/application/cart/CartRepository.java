package ca.ulaval.glo4002.cart.application.cart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import ca.ulaval.glo4002.cart.application.PersistenceException;
import ca.ulaval.glo4002.cart.application.XmlUtils;
import ca.ulaval.glo4002.cart.domain.cart.Cart;

public class CartRepository {
    private static final String CART_STORAGE = "cart-storage";

    private static File storageFile;

    private boolean xmlPersistence;
    private List<Cart> list;

    static {
        storageFile = XmlUtils.createStorageFile(CART_STORAGE);
    }

    public CartRepository(boolean xmlPersistence) {
        this.xmlPersistence = xmlPersistence;
    }

    public List<Cart> retrieveCarts() {
        if (xmlPersistence) {
            Unmarshaller unmarshaller = XmlUtils.createUnmarshaller();
            try {
                return ((CartList) unmarshaller.unmarshal(storageFile)).getCarts();
            } catch (JAXBException e) {
                return new ArrayList<>();
            }
        }
        else {
            return list;
        }
    }

    public void persistCarts(List<Cart> carts) {
        Marshaller marshaller = XmlUtils.createMarshaller();
        try {
            marshaller.marshal(new CartList(carts), storageFile);
        } catch (JAXBException e) {
            throw new PersistenceException(e);
        }
    }
}
