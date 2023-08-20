package com.store.mystorespringboot.dto;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@EqualsAndHashCode
@NoArgsConstructor
public class DressesColorRequestDto {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
