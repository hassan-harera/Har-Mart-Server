package com.harea.offer.service

import com.harea.offer.entity.Offer
import java.util.*


interface OfferService {

    fun getOffer(offerId: Int): Optional<Offer>

    fun getAllOffers(
        page: Int,
        pageSize: Int
    ): MutableList<Offer>

    fun getOffers(type: String): List<Offer>
    fun addOffer(offer: Offer): Offer?
}