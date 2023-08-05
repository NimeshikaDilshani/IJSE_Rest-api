package com.ijse.restapi.entity;

import java.util.List;

import org.hibernate.annotations.CollectionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Item> items;
    

}
