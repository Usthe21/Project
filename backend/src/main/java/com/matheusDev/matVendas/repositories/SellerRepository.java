package com.matheusDev.matVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusDev.matVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
