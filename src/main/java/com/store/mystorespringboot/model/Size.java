package com.store.mystorespringboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private Long sizeId;

    @Column(name = "size_name")
    private String sizeName;

    @ManyToOne
    @JoinColumn(name = "dress_id")
    private Dresses dresses;

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Dresses getDresses() {
        return dresses;
    }

    public void setDresses(Dresses dresses) {
        this.dresses = dresses;
    }
}
