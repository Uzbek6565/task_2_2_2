package com.example.task222.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Timestamp date;

    @Column(nullable = false)
    private double totalPrice;

    @Column(nullable = false)
    private Integer orderNumber;

    @OneToOne(optional = false)
    private Currency currency;

    @OneToOne
    private Payment payment;
}
