package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.*;
import org.example.railwaystationweb.repositoryClasses.StationsRepository;
import org.example.railwaystationweb.repositoryClasses.TrainStationsRepository;
import org.example.railwaystationweb.repositoryClasses.TrainsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class TrainsStationsService {
    private final TrainStationsRepository trainStationsRepository;
    private final TrainsRepository trainsRepository;
    private final StationsRepository stationsRepository;

    public TrainsStationsService(TrainStationsRepository trainStationsRepository, TrainsRepository trainsRepository, StationsRepository stationsRepository) {
        this.trainStationsRepository = trainStationsRepository;
        this.trainsRepository = trainsRepository;
        this.stationsRepository = stationsRepository;
    }

    public List<TrainsStations> getAllTrainsStations() {return trainStationsRepository.findAll();}

    public void addTrainsStations(int trainsId, int stationsId, LocalTime arrivalTime, LocalTime departureTime) {
        Trains train = trainsRepository.findById(trainsId).orElseThrow(() -> new RuntimeException("Train with ID " + trainsId + " not found"));
        Stations stations = stationsRepository.findById(stationsId).orElseThrow(() -> new RuntimeException("Car with ID " + stationsId + " not found"));
        TrainsStations trainsStations = new TrainsStations(train, stations,arrivalTime,departureTime);
        trainStationsRepository.save(trainsStations);
    }
    public void updateTrainsStations(int id,int trainsId, int stationsId, LocalTime arrivalTime, LocalTime departureTime) {
        trainStationsRepository.findById(id).ifPresent(trainsStations -> {
            trainsRepository.findById(trainsId).ifPresent(train -> {
                stationsRepository.findById(stationsId).ifPresent(stations -> {
                    trainsStations.setTrainID(train);
                    trainsStations.setStationID(stations);
                    trainsStations.setArrivalTime(arrivalTime);
                    trainsStations.setDepartureTime(departureTime);
                    trainStationsRepository.save(trainsStations);
                });
            });
        });
    }
    public void deleteTrainsStations(int id) {
        trainStationsRepository.deleteById(id);
    }
}

