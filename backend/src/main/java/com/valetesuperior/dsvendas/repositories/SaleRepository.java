package com.valetesuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valetesuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
