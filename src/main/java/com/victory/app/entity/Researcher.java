package com.victory.app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Researcher {
    @Id
    private int id;
    private String name;
    private String address;
    private int age;
}
