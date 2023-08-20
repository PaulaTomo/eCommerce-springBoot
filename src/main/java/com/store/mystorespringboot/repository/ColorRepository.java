package com.store.mystorespringboot.repository;

import com.store.mystorespringboot.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Long> {
}
