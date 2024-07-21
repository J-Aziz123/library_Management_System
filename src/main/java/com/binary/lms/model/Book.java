package com.binary.lms.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String author;
    private String isbn;
    private Date publishedDate;
    private Double price;
    private String image; // Add this field to store image file names

    @ManyToOne
    @JoinColumn(name = "customer_id")
    // @JsonBackReference
    private Customer customer;
}
