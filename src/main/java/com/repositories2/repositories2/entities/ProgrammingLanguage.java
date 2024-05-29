package com.repositories2.repositories2.entities;

import jakarta.persistence.*;

@Entity
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column
    private Integer firstAppereance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage(Long id, String name, Integer firstAppereance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppereance = firstAppereance;
        this.inventor = inventor;
    }

    public ProgrammingLanguage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstAppereance() {
        return firstAppereance;
    }

    public void setFirstAppereance(Integer firstAppereance) {
        this.firstAppereance = firstAppereance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
