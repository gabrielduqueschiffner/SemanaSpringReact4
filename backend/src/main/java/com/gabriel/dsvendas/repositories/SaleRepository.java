package com.gabriel.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
