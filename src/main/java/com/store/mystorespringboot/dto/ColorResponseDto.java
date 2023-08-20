package com.store.mystorespringboot.dto;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor

public class ColorResponseDto {

        private Long id;
        private String colorName;
        private DressesColorRequestDto dresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public DressesColorRequestDto getDresses() {
        return dresses;
    }

    public void setDresses(DressesColorRequestDto dresses) {
        this.dresses = dresses;
    }
}

