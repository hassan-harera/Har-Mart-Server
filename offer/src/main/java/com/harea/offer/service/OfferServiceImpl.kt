package com.example.ecommerce.service

import com.example.ecommerce.pojo.Offer
import com.example.ecommerce.repostory.OfferRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*


@Service("offerService")
class OfferServiceImpl : OfferService {

    @Autowired
    lateinit var offerRepository : OfferRepository

    override fun getOffer(offerId: Int): Optional<Offer> {
        return offerRepository.findById(offerId)
    }

    override fun getAllOffers(page: Int, pageSize: Int): MutableList<Offer> {
        return offerRepository.findAll(Pageable.ofSize(pageSize).withPage(page)).content
    }

    override fun getOffers(type: String): List<Offer> {
        return offerRepository.findOfferByOffersGroup(type)
    }

    override fun addOffer(offer: Offer): Offer? {
        return offerRepository.save(offer)
    }
}