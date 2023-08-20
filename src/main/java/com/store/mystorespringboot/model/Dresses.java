package com.store.mystorespringboot.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Entity
@Table(name = "dresses")
public class Dresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dress_id")
    private Long id;

    @Column(name = "dress_name")
    private String dressName;
    @Column(name = "price")
    private Double price;
    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "image_path")
    private String imagePath;

    public void setId(Long id) {
        this.id = id;
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

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getDressName() {
        return dressName;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
