package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
@Entity
@Table(name = "tickets")
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    @ManyToOne
    @JoinColumn(name = "ClientId")
    private Clients client;

    @ManyToOne
    @JoinColumn(name = "TrainNum")
    private Trains trainNum;

    @ManyToOne
    @JoinColumn(name = "StationID1")
    private Stations station1;

    @ManyToOne
    @JoinColumn(name = "DateTimeDepartureID")
    private TimeTrainStation dateTimeDeparture;

    @ManyToOne
    @JoinColumn(name = "StationID2")
    private Stations station2;

    @ManyToOne
    @JoinColumn(name = "DateTimeArrivalID")
    private TimeTrainStation dateTimeArrival;

    @ManyToOne
    @JoinColumn(name = "CarsID")
    private Cars car;

    @ManyToOne
    @JoinColumn(name = "SeatID")
    private SeatsCars seat;

    @Column(name = "CostTicket")
    private double costTicket;

    @Column(name = "Linens")
    private boolean linens;

    @Column(name = "Drink")
    private boolean drink;

    @Column(name = "Snacks")
    private boolean snacks;

    public Tickets() {}

    public Tickets(Clients client, Trains trainNum,Stations station1,TimeTrainStation dateTimeDeparture,Stations station2,TimeTrainStation dateTimeArrival,
                   Cars cars,SeatsCars seat,double costTicket,boolean linens,boolean drink,boolean snacks) {
        this.client = client;
        this.trainNum = trainNum;
        this.station1 = station1;
        this.dateTimeDeparture = dateTimeDeparture;
        this.station2 = station2;
        this.dateTimeArrival = dateTimeArrival;
        this.car = cars;
        this.seat = seat;
        this.costTicket = costTicket;
        this.linens = linens;
        this.drink = drink;
        this.snacks = snacks;
    }

    public int getTicketId() {return ticketId;}
    public void setTicketId(int ticketId) {this.ticketId = ticketId;}
    public Clients getClient() {return client;}
    public void setClient(Clients client) {this.client = client;}
    public Trains getTrainNum() {return trainNum;}
    public void setTrainNum(Trains trainNum) {this.trainNum = trainNum;}
    public Stations getStation1() {return station1;}
    public void setStation1(Stations station1) {this.station1 = station1;}
    public TimeTrainStation getDateTimeDeparture() {return dateTimeDeparture;}
    public void setDateTimeDeparture(TimeTrainStation dateTimeDeparture) {this.dateTimeDeparture = dateTimeDeparture;}
    public Stations getStation2() {return station2;}
    public void setStation2(Stations station2) {this.station2 = station2;}
    public TimeTrainStation getDateTimeArrival() {return dateTimeArrival;}
    public void setDateTimeArrival(TimeTrainStation dateTimeArrival) {this.dateTimeArrival = dateTimeArrival;}
    public Cars getCar() {return car;}
    public void setCar(Cars car) {this.car = car;}
    public SeatsCars getSeat() {return seat;}
    public void setSeat(SeatsCars seat) {this.seat = seat;}
    public double getCostTicket() {return costTicket;}
    public void setCostTicket(double costTicket) {this.costTicket = costTicket;}
    public boolean isLinens() {return linens;}
    public void setLinens(boolean linens) {this.linens = linens;}
    public boolean isDrink() {return drink;}
    public void setDrink(boolean drink) {this.drink = drink;}
    public boolean isSnacks() {return snacks;}
    public void setSnacks(boolean snacks) {this.snacks = snacks;}

}
