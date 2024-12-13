package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stations")
public class Stations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "NameStation", nullable = false)
    private String nameStation;

    public Stations(String nameStation) {
        this.nameStation = nameStation;
    }
    public Stations() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNameStation() {return nameStation;}
    public void setNameStation(String nameStation) {this.nameStation = nameStation;}

}
