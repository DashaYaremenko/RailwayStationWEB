package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cars")

public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "TypeCars",nullable = false)
    private String typeCars;

    @Column(name = "NumSeats",nullable = false)
    private int numSeats;

    public Cars(String typeCars, int numSeats) {
        this.typeCars = typeCars;
        this.numSeats = numSeats;
    }
    public Cars() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTypeCars() {return typeCars;}
    public void setTypeCars(String typeCars) {this.typeCars = typeCars;}
    public int getNumSeats() {return numSeats;}
    public void setNumSeats(int numSeats) {this.numSeats = numSeats;}

}
