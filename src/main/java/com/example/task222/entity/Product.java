package com.example.task222.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String definition;

    @Column(nullable = false)
    private String characteristics;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToMany
    private Set<Category> categorySet;

    @OneToMany
    private List<Attachment> attachmentList;

    @OneToOne
    private Currency currency;
}
