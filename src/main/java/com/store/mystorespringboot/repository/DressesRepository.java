package com.store.mystorespringboot.repository;

import com.store.mystorespringboot.model.Dresses;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DressesRepository extends JpaRepository<Dresses, Long> {

}
