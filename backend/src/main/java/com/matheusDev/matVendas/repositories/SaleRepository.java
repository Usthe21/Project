package com.matheusDev.matVendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.matheusDev.matVendas.dto.SaleSuccessDTO;
import com.matheusDev.matVendas.dto.SaleSumDTO;
import com.matheusDev.matVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.matheusDev.matVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))  "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.matheusDev.matVendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))  "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();
}
