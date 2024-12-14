package org.example.railwaystationweb.dataClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class SearchTrain {
    private int trainId;
    private String trainName;
    private String departureStation;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private String arrivalStation;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;
    private String carType;
    private Long availableSeats;
    @Id
    private Long id;

    public SearchTrain() {}
    public SearchTrain(int trainId, String trainName, String departureStation, LocalDate departureDate, LocalTime departureTime,
                       String arrivalStation, LocalDate arrivalDate, LocalTime arrivalTime, String carType, Long availableSeats) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.departureStation = departureStation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalStation = arrivalStation;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.carType = carType;
        this.availableSeats = availableSeats;
    }

    public int getTrainId() {return trainId;}
    public void setTrainId(int trainId) {this.trainId = trainId;}
    public String getTrainName() {return trainName;}
    public void setTrainName(String trainName) {this.trainName = trainName;}
    public String getDepartureStation() {return departureStation;}
    public void setDepartureStation(String departureStation) {this.departureStation = departureStation;}
    public LocalDate getDepartureDate() {return departureDate;}
    public void setDepartureDate(LocalDate departureDate) {this.departureDate = departureDate;}
    public LocalTime getDepartureTime() {return departureTime;}
    public void setDepartureTime(LocalTime departureTime) {this.departureTime = departureTime;}
    public String getArrivalStation() {return arrivalStation;}
    public void setArrivalStation(String arrivalStation) {this.arrivalStation = arrivalStation;}
    public LocalDate getArrivalDate() {return arrivalDate;}
    public void setArrivalDate(LocalDate arrivalDate) {this.arrivalDate = arrivalDate;}
    public LocalTime getArrivalTime() {return arrivalTime;}
    public void setArrivalTime(LocalTime arrivalTime) {this.arrivalTime = arrivalTime;}
    public String getCarType() {return carType;}
    public void setCarType(String carType) {this.carType = carType;}
    public Long getAvailableSeats() {return availableSeats;}
    public void setAvailableSeats(Long availableSeats) {this.availableSeats = availableSeats;}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
