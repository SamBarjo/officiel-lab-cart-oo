package ca.ulaval.glo4002.cart.domain.shop;

import javax.xml.bind.annotation.XmlElement;

public class FragileShopItem extends ShopItem {
    private static final int FLAT_PRICE = 5;
    private static final int PRICE_PER_KG = 3;

    @XmlElement
    private String itemSku;

    @XmlElement
    private String name;

    @XmlElement
    private boolean available;

    @XmlElement
    private int price;

    @XmlElement
    private int weight;

    @XmlElement
    private double profitMarginPercentage;

    public FragileShopItem(String itemSku, String name, int price, int weight, double profitMarginPercentage,
            boolean available) {
        this.itemSku = itemSku;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.profitMarginPercentage = profitMarginPercentage;
        this.available = available;
    }

    @Override
    public String getSku() {
        return itemSku;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public boolean hasSku(String sku) {
        return this.itemSku.equals(sku);
    }

    @Override
    public int getPriceWithShipping() {
        return price + weight * PRICE_PER_KG + FLAT_PRICE;
    }
}
