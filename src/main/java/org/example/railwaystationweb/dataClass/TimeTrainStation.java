package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "time_train_stations")
public class TimeTrainStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DeparDate")
    private LocalDate deparDate;

    @ManyToOne
    @JoinColumn(name = "DeparStationTime")
    private TrainsStations deparStationTime;

    @Column(name = "ArrivDate")
    private LocalDate arrivDate;

    @ManyToOne
    @JoinColumn(name = "ArrivStationTime")
    private TrainsStations arrivStationTime;

    public TimeTrainStation(LocalDate deparDate, TrainsStations deparStationTime, LocalDate arrivDate, TrainsStations arrivStationTime) {
        this.deparDate = deparDate;
        this.deparStationTime = deparStationTime;
        this.arrivDate = arrivDate;
        this.arrivStationTime = arrivStationTime;
    }

    public TimeTrainStation() {
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public LocalDate getDeparDate() {return deparDate;}
    public void setDeparDate(LocalDate deparDate) {this.deparDate = deparDate;}
    public TrainsStations getDeparStationTime() {return deparStationTime;}
    public void setDeparStationTime(TrainsStations deparStationTime) {this.deparStationTime = deparStationTime;}
    public LocalDate getArrivDate() {return arrivDate;}
    public void setArrivDate(LocalDate arrivDate) {this.arrivDate = arrivDate;}
    public TrainsStations getArrivStationTime() {return arrivStationTime;}
    public void setArrivStationTime(TrainsStations arrivStationTime) {this.arrivStationTime = arrivStationTime;}
}