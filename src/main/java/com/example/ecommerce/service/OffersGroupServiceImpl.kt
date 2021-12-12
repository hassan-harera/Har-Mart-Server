package com.example.ecommerce.service

import com.example.ecommerce.pojo.OffersGroup
import com.example.ecommerce.repostory.OffersGroupRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service("offersGroupService")
class OffersGroupServiceImpl : OffersGroupService {

    @Autowired
    lateinit var offersGroupRepository : OffersGroupRepository

    override fun getAllOffersGroup(): List<OffersGroup> =
        offersGroupRepository.findAll()

    override fun addOffersGroup(offersGroup : OffersGroup): OffersGroup? =
        offersGroupRepository.save(offersGroup)
}