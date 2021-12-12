package com.example.ecommerce.controller;


import com.example.ecommerce.pojo.Offer;
import com.example.ecommerce.service.OfferService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OfferController {

    @Resource(name = "offerService")
    private OfferService offerService;

    @GetMapping("/offers")
    public List<Offer> getOffers(
            @RequestParam("page") Integer page,
            @RequestParam("page-size") Integer pageSize
    ) {
       return offerService.getAllOffers(page, pageSize);
    }

    @GetMapping("/{offer-collection}/offers")
    public List<Offer> getCategoryProducts(
            @PathVariable("offer-collection") String type
    ) {
       return offerService.getOffers(type);
    }

    @GetMapping("/offer/{offer-id}")
    public Offer getProduct(
            @PathVariable("offer-id") Integer offerId
    ) {
       return offerService.getOffer(offerId).orElse(null);
    }

    @PostMapping("/offer")
    public Offer insertProduct(
            @RequestBody Offer offer
    ) {
       return offerService.addOffer(offer);
    }
}
