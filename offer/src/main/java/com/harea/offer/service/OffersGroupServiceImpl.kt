package com.harea.offer.service

import com.harea.offer.entity.OffersGroup
import com.harea.offer.repository.OffersGroupRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class OffersGroupServiceImpl : OffersGroupService {

    @Autowired
    lateinit var offersGroupRepository : OffersGroupRepository

    override fun getAllOffersGroup(): List<OffersGroup> =
        offersGroupRepository.findAll()

    override fun addOffersGroup(offersGroup : OffersGroup): OffersGroup? =
        offersGroupRepository.save(offersGroup)
}