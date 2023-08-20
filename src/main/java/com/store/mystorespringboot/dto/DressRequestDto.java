package com.store.mystorespringboot.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@EqualsAndHashCode
@NoArgsConstructor
public class DressRequestDto {
    private String dressName;
    private Double price;
    private String category;
    private String quantity;
    private String imagePath;

    public String getDressName() {
        return dressName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setDressName(String dressName) {
        this.dressName = dressName;
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