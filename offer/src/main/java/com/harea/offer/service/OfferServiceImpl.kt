package com.harea.offer.service

import com.harea.offer.entity.Offer
import com.harea.offer.repository.OfferRepository
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*


@Service
class OfferServiceImpl(
    private var offerRepository : OfferRepository,
) : OfferService {

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