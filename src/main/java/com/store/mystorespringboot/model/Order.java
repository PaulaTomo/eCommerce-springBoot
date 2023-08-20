package com.store.mystorespringboot.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "date_orders")
    private LocalDate dateOrders;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "payment_method")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "dress_id")
    private Dresses dresses;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

}
