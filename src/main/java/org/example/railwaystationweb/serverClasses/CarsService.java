package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.Cars;
import org.example.railwaystationweb.dataClass.Stations;
import org.example.railwaystationweb.repositoryClasses.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {
    private CarsRepository carsRepository;
    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }
    public List<Cars> getAllCars() {return carsRepository.findAll();}

    public void addCars(String typeCar,int numSeats) {
        Cars cars = new Cars(typeCar,numSeats);
        carsRepository.save(cars);
    }

    public void updateCars(int id,String typeCar,int numSeats) {
        carsRepository.findById(id).ifPresent(cars -> {
            cars.setTypeCars(typeCar);
            cars.setNumSeats(numSeats);
            carsRepository.save(cars);
        });
    }
    public void deleteCars(int id) {
        carsRepository.deleteById(id);
    }
}
