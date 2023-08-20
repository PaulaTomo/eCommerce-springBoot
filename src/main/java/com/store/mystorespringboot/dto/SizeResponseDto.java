package com.store.mystorespringboot.dto;

import java.util.Objects;

public class SizeResponseDto {

        private Long id;
        private String sizeName;
    private DressSizeRequestDto dresses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        SizeResponseDto that = (SizeResponseDto) o;
        return Objects.equals(id, that.id) && Objects.equals(sizeName, that.sizeName) && Objects.equals(dresses, that.dresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sizeName, dresses);
    }
}
