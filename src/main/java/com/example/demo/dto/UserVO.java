package com.example.demo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name="user")
public class UserVO {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name="pwd")
    private String pwd;
}
