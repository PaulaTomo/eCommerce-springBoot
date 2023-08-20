package com.store.mystorespringboot.repository;

import com.store.mystorespringboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
