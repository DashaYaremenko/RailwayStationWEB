package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "trainstations")
public class TrainsStations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "TrainID",referencedColumnName = "ID")
    private Trains trainID;

    @ManyToOne
    @JoinColumn(name = "StationID", referencedColumnName = "ID")
    private Stations stationID;

    @Column(name = "ArrivTime")
    private LocalTime arrivalTime;

    @Column(name = "DeparTime")
    private LocalTime departureTime;

    public TrainsStations(Trains trainID, Stations stationID, LocalTime arrivalTime, LocalTime departureTime) {
        this.trainID = trainID;
        this.stationID = stationID;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
    public TrainsStations() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Trains getTrainID() {return trainID;}
    public void setTrainID(Trains trainID) {this.trainID = trainID;}
    public Stations getStationID() {return stationID;}
    public void setStationID(Stations stationID) {this.stationID = stationID;}
    public LocalTime getArrivalTime() {return arrivalTime;}
    public void setArrivalTime(LocalTime arrivalTime) {this.arrivalTime = arrivalTime;}
    public LocalTime getDepartureTime() {return departureTime;}
    public void setDepartureTime(LocalTime departureTime) {this.departureTime = departureTime;}
}
