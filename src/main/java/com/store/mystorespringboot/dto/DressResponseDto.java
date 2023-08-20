package com.store.mystorespringboot.dto;

import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;



@EqualsAndHashCode
@NoArgsConstructor
public class DressResponseDto {

    private Long id;
    private String DressName;
    private Double price;
    private String category;
    private String quantity;
    private String imagePath;

    public Long getId() {
        return id;
    }

    public String getDressName() {
        return DressName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDressName(String dressName) {
        DressName = dressName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}