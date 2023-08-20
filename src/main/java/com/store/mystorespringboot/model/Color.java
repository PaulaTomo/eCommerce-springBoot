package com.store.mystorespringboot.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Table(name = "colors")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private Long id;

    @Column(name = "color_name")
    private String colorName;

    @ManyToOne
    @JoinColumn(name = "dress_id")
    private Dresses dresses;

    public Long getId() {
        return id;
    }

    public String getColorName() {
        return colorName;
    }

    public Dresses getDresses() {
        return dresses;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setDresses(Dresses dresses) {
        this.dresses = dresses;
    }

}
