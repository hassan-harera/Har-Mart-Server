package com.example.ecommerce.service

import com.example.ecommerce.pojo.OffersGroup


interface OffersGroupService {

    fun getAllOffersGroup(): List<OffersGroup>
    fun addOffersGroup(offersGroup: OffersGroup): OffersGroup?
}