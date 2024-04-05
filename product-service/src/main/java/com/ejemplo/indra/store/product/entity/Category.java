package com.ejemplo.indra.store.product.entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_categories")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;



}
