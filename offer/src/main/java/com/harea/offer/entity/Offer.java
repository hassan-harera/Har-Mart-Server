package com.harea.offer.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "offer")
public class Offer {
    @Id()
    @Column(name = "offer_id")
    Integer offerId;
    @Column(name = "product_id")
    String productId;
    @Column(name = "offers_group_image_url")
    String offersGroup;
    @Column(name = "old_price")
    String oldPrice;
    @Column(name = "new_price")
    String nwqPrice;
    @Column(name = "offer_title")
    String offerTitle;

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOffersGroup() {
        return offersGroup;
    }

    public void setOffersGroup(String offerGroup) {
        this.offersGroup = offerGroup;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getNwqPrice() {
        return nwqPrice;
    }

    public void setNwqPrice(String nwqPrice) {
        this.nwqPrice = nwqPrice;
    }

    public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }
}
