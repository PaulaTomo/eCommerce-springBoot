package com.store.mystorespringboot.dto;

import com.store.mystorespringboot.model.Dresses;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@EqualsAndHashCode
@NoArgsConstructor
public class ColorRequestDto {
    private Long colorId;
    private String colorName;
    private DressesColorRequestDto dresses;

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }



    public Long getColorId() {
        return colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public DressesColorRequestDto getDresses() {
        return dresses;
    }

    public void setDresses(DressesColorRequestDto dresses) {
        this.dresses = dresses;
    }
}
