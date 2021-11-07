package com.matheusDev.matVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusDev.matVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
