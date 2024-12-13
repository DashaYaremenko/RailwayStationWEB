package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.TimeTrainStation;
import org.example.railwaystationweb.dataClass.TrainsStations;
import org.example.railwaystationweb.repositoryClasses.TimeTrainStationsRepository;
import org.example.railwaystationweb.repositoryClasses.TrainStationsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TimeTrainStationService {
    private final TrainStationsRepository trainStationsRepository;
    private final TimeTrainStationsRepository timeTrainStationsRepository;

    public TimeTrainStationService(TrainStationsRepository trainStationsRepository, TimeTrainStationsRepository timeTrainStationsRepository) {
        this.timeTrainStationsRepository = timeTrainStationsRepository;
        this.trainStationsRepository=trainStationsRepository;
    }
    public List<TimeTrainStation> getAllTimeTrainStations(){return timeTrainStationsRepository.findAll();}

    public void addTimeTrainStation(LocalDate departureDate,int departureTimeStationId, LocalDate arrivalDate,  int arrivalTimeStationId){
        TrainsStations trainStations=trainStationsRepository.findById(departureTimeStationId).orElseThrow(() -> new RuntimeException("TrainsStations with ID " + departureTimeStationId + " not found"));
        TrainsStations trainsStations2=trainStationsRepository.findById(arrivalTimeStationId).orElseThrow(() -> new RuntimeException("TrainsStations with ID " + arrivalTimeStationId + " not found"));
        TimeTrainStation timeTrainStation=new TimeTrainStation(departureDate,trainStations,arrivalDate,trainsStations2);
        timeTrainStationsRepository.save(timeTrainStation);
    }

    public void updateTimeTrainStation(int id,LocalDate departureDate,int departureTimeStationId, LocalDate arrivalDate,int arrivalTimeStationId ){
        timeTrainStationsRepository.findById(id).ifPresent(timeTrainStation -> {
            trainStationsRepository.findById(departureTimeStationId).ifPresent(trainStation -> {
                trainStationsRepository.findById(arrivalTimeStationId).ifPresent(trainStation1 -> {
                    timeTrainStation.setDeparDate(departureDate);
                    timeTrainStation.setDeparStationTime(trainStation);
                    timeTrainStation.setArrivDate(arrivalDate);
                    timeTrainStation.setArrivStationTime(trainStation1);
                    timeTrainStationsRepository.save(timeTrainStation);
                });
            });
        });
    }
    public void deleteTimeTrainStation(int id){
        timeTrainStationsRepository.deleteById(id);
    }
}
