package com.victory.app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Researcher {
   @Id
    private int id;
    private String name;
    private String address;
    private int age;
}
