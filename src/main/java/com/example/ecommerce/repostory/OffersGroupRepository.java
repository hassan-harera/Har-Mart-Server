package com.example.ecommerce.repostory;


import com.example.ecommerce.pojo.OffersGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffersGroupRepository extends JpaRepository<OffersGroup, String> {}
