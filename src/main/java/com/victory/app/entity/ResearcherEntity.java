package com.victory.app.entity;

import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
public class ResearcherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long researcherId;
    private String name;
    private String address;
    private int age;
}
