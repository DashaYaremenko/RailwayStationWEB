package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.Cars;
import org.example.railwaystationweb.dataClass.TrainCars;
import org.example.railwaystationweb.dataClass.Trains;
import org.example.railwaystationweb.repositoryClasses.CarsRepository;
import org.example.railwaystationweb.repositoryClasses.TrainCarsRepository;
import org.example.railwaystationweb.repositoryClasses.TrainsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainsCarsService {
    private final TrainCarsRepository trainCarsRepository;
    private final CarsRepository carsRepository;
    private final TrainsRepository trainsRepository;

    public TrainsCarsService(TrainCarsRepository trainCarsRepository,
                             CarsRepository carsRepository,
                             TrainsRepository trainsRepository) {
        this.trainCarsRepository = trainCarsRepository;
        this.carsRepository = carsRepository;
        this.trainsRepository = trainsRepository;
    }
    public List<TrainCars> getAllTrainsCars() {return trainCarsRepository.findAll();}

    public void addTrainsCar(int trainsId, int carId) {
        Trains train = trainsRepository.findById(trainsId).orElseThrow(() -> new RuntimeException("Train with ID " + trainsId + " not found"));
        Cars car = carsRepository.findById(carId).orElseThrow(() -> new RuntimeException("Car with ID " + carId + " not found"));
        TrainCars trainsCars = new TrainCars(train, car);
        trainCarsRepository.save(trainsCars);
    }
    public void updateTrainsCar(int id,int trainsId, int carId, LocalDate date_reception) {
        trainCarsRepository.findById(id).ifPresent(trainsCars -> {
            trainsRepository.findById(trainsId).ifPresent(train -> {
                carsRepository.findById(carId).ifPresent(car -> {
                    trainsCars.setTrainId(train);
                    trainsCars.setCarsId(car);
                    trainsCars.setDate_reception(date_reception);
                    trainCarsRepository.save(trainsCars);
                });
            });
        });
    }
    public void deleteTrainsCar(int id) {
        trainCarsRepository.deleteById(id);
    }


}
