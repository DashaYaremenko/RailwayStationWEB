package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trains")
public class Trains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NameMar", nullable = false)
    private String nameMar;

    @Column(name = "TypeTrain", nullable = false)
    private String typeTrain;

    public Trains(String nameM, String typeTrain) {
        this.nameMar = nameM;
        this.typeTrain = typeTrain;
    }

    public Trains() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNameMar() {return nameMar;}
    public void setNameMar(String nameMar) {this.nameMar = nameMar;}
    public String getTypeTrain() {return typeTrain;}
    public void setTypeTrain(String typeTrain) {this.typeTrain = typeTrain;}

}