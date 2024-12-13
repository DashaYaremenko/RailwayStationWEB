package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "train_cars")
public class TrainCars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "TrainID")
    private Trains trainsID;

    @ManyToOne
    @JoinColumn(name = "CarsID")
    private Cars carsID;

    @Column(name = "Date_Reception", nullable = false)
    private LocalDate dateReception;

    public TrainCars(Trains trainsID, Cars carsID) {
        this.trainsID = trainsID;
        this.carsID = carsID;
        this.dateReception = LocalDate.now();
    }
    public TrainCars() {}

    @PrePersist
    protected void onCreate() {
        if (this.dateReception == null) {
            this.dateReception = LocalDate.now(); // Установити поточну дату, якщо вона ще не задана
        }
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Cars getCarsId() {return carsID;}
    public void setCarsId(Cars carsId) {this.carsID = carsId;}
    public LocalDate getDate_reception() {return dateReception;}
    public void setDate_reception(LocalDate date_reception) {this.dateReception = date_reception;}
    public Trains getTrainId() {return trainsID;}
    public void setTrainId(Trains trainId) {this.trainsID = trainId;}

}
