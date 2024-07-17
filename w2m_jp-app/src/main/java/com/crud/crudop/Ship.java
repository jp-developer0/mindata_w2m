package com.crud.crudop;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ship_table")
public class Ship {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String ship;
    private String movie;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getShip(){
        return ship;
    }

    public void setShip(String name){
        this.ship = name;
    }

    public String getMovie(){
        return movie;
    }

    public void setMovie(String email){
        this.movie = email;
    }
}


