package com.store.mystorespringboot.repository;

import com.store.mystorespringboot.model.Dresses;
import com.store.mystorespringboot.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SizeRepository extends JpaRepository<Size, Long> {
    List<Size> findByDresses(Dresses dresses);
}
