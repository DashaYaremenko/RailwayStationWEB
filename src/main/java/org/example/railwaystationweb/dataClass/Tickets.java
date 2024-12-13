package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
@Entity
@Table(name = "tickets")
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    @ManyToOne
    @JoinColumn(name = "ClientId", referencedColumnName = "ID")
    private Clients client;

    @ManyToOne
    @JoinColumn(name = "TrainNum",referencedColumnName = "ID")
    private Trains trainNum;

    @ManyToOne
    @JoinColumn(name = "StationID1",referencedColumnName = "ID")
    private Stations station1;

    @ManyToOne
    @JoinColumn(name = "DateTimeDepartureID",referencedColumnName = "ID")
    private TimeTrainStation dateTimeDeparture;

    @ManyToOne
    @JoinColumn(name = "StationID2", referencedColumnName = "ID")
    private Stations station2;

    @ManyToOne
    @JoinColumn(name = "DateTimeArrivalID",referencedColumnName = "ID")
    private TimeTrainStation dateTimeArrival;

    @ManyToOne
    @JoinColumn(name = "CarsID",referencedColumnName = "ID")
    private Cars car;

    @ManyToOne
    @JoinColumn(name = "SeatID",referencedColumnName = "ID")
    private SeatsCars seat;

    @Column(name = "CostTicket")
    private double costTicket;

    @Column(name = "Linens")
    private boolean linens;

    @Column(name = "Drink")
    private boolean drink;

    @Column(name = "Snacks")
    private boolean snacks;
}
