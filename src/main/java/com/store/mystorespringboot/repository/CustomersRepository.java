package com.store.mystorespringboot.repository;

import com.store.mystorespringboot.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
