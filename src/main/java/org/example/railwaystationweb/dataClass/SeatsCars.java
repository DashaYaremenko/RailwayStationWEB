package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;

@Entity
@Table(name = "seats_cars")
public class SeatsCars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "CarsID")
    private Cars carsID;

    @Column(name = "SeatNumber")
    private int seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "StatusSeat")
    private StatusSeat statusSeat;

    public enum StatusSeat {Доступне, Заброньоване}

    public SeatsCars(Cars carsID, int seatNumber, StatusSeat statusSeat) {
        this.carsID = carsID;
        this.seatNumber = seatNumber;
        this.statusSeat = statusSeat;
    }
    public SeatsCars() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Cars getCarsID() {return carsID;}
    public void setCarsID(Cars carsID) {this.carsID = carsID;}
    public int getSeatNumber() {return seatNumber;}
    public void setSeatNumber(int seatNumber) {this.seatNumber = seatNumber;}
    public StatusSeat getStatusSeat() {return statusSeat;}
    public void setStatusSeat(StatusSeat statusSeat) {this.statusSeat = statusSeat;}

}
