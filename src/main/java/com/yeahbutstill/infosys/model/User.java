package com.yeahbutstill.infosys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "ID", length = 20)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;
}
