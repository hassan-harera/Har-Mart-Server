package com.harea.offer.service

import com.harea.offer.entity.OffersGroup


interface OffersGroupService {

    fun getAllOffersGroup(): List<OffersGroup>
    fun addOffersGroup(offersGroup: OffersGroup): OffersGroup?
}