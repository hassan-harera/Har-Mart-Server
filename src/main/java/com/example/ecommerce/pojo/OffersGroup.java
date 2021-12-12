package com.example.ecommerce.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Offers_Group")
public class OffersGroup {
    @Id()
    @Column(name = "offers_group_name")
    String offersGroupName;
    @Column(name = "offers_group_image_url")
    String offersGroupImageUrl;

    public String getOffersGroupName() {
        return offersGroupName;
    }

    public void setOffersGroupName(String offersGroupName) {
        this.offersGroupName = offersGroupName;
    }

    public String getOffersGroupImageUrl() {
        return offersGroupImageUrl;
    }

    public void setOffersGroupImageUrl(String offersGroupImageUrl) {
        this.offersGroupImageUrl = offersGroupImageUrl;
    }
}
