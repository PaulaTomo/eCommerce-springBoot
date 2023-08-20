package com.store.mystorespringboot.dto;

import com.store.mystorespringboot.model.Dresses;


import java.util.Objects;

public class SizeRequestDto {
    private String sizeName;
    private DressSizeRequestDto dresses;

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public DressSizeRequestDto getDresses() {
        return dresses;
    }

    public void setDresses(DressSizeRequestDto dresses) {
        this.dresses = dresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SizeRequestDto that = (SizeRequestDto) o;
        return Objects.equals(sizeName, that.sizeName) && Objects.equals(dresses, that.dresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeName, dresses);
    }


}
