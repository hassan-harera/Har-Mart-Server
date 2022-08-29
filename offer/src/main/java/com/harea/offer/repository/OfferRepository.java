package com.harea.offer.repository;


import com.example.ecommerce.pojo.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

    List<Offer> findOfferByOffersGroup(String offersGroup);

}
