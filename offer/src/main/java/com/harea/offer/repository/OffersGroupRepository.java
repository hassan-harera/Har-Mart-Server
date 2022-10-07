package com.harea.offer.repository;


import com.harea.offer.entity.OffersGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffersGroupRepository extends JpaRepository<OffersGroup, String> {}
