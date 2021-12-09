package com.example.demo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name="card")
public class CardVO {

    @Id
    @Column(name = "rowid")
    private int rowid;

    @Column(name = "userid")
    private String userid;

    @Column(name = "cardcompany")
    private String cardcompany;

    @Column(name = "card_num")
    private String card_num;

    @Column(name = "pwd")
    private String pwd;
}
