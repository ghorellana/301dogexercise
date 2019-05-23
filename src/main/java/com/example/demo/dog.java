package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dogname;
    private Number age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }
}
