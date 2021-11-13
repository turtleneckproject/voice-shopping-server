package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name="basket")
public class BasketVO {

    @Id
    @Column(name = "rowid")
    private int rowid;

    @Column(name = "customer")
    private String customer;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private String price;

    @Column(name = "pid")
    private String pid;

    @Column(name = "num")
    private String num;

}
