package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.Cars;
import org.example.railwaystationweb.dataClass.SeatsCars;
import org.example.railwaystationweb.repositoryClasses.CarsRepository;
import org.example.railwaystationweb.repositoryClasses.SeatsCarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsCarsService {
    private CarsRepository carsRepository;
    private SeatsCarsRepository seatsCarsRepository;

    public SeatsCarsService(CarsRepository carsRepository, SeatsCarsRepository seatsCarsRepository) {
        this.carsRepository = carsRepository;
        this.seatsCarsRepository = seatsCarsRepository;
    }
    public List<SeatsCars> getAllSeatsCars() {return seatsCarsRepository.findAll();}

    public void addSeatsCars(int carsId, int seatNumber, SeatsCars.StatusSeat statusSeats) {
        Cars carsID = carsRepository.findById(carsId).orElseThrow(() -> new RuntimeException("Car with ID " + carsId + " not found"));
        SeatsCars seatsCars= new SeatsCars(carsID, seatNumber, statusSeats);
        seatsCarsRepository.save(seatsCars);
    }
    public void updateSeatsCars(int id,int carsId, int seatNumber, SeatsCars.StatusSeat statusSeats) {
        seatsCarsRepository.findById(id).ifPresent(seatsCars -> {
            carsRepository.findById(carsId).ifPresent(car -> {
                seatsCars.setCarsID(car);
                seatsCars.setSeatNumber(seatNumber);
                seatsCars.setStatusSeat(statusSeats);
                seatsCarsRepository.save(seatsCars);
            });
        });
    }
    public void deleteSeatsCars(int id) {
        seatsCarsRepository.deleteById(id);
    }
}
