package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
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



}
