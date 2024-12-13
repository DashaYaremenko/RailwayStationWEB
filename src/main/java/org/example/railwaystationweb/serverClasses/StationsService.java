package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.Stations;
import org.example.railwaystationweb.repositoryClasses.StationsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationsService {
    private final StationsRepository stationsRepository;

    public StationsService(StationsRepository stationsRepository) {
        this.stationsRepository = stationsRepository;
    }
    public List<Stations> getAllStations() {return stationsRepository.findAll();}

    public void addStations(String stationName) {
        Stations stations = new Stations(stationName);
        stationsRepository.save(stations);
    }

    public void updateStations(int id,String stationName) {
        stationsRepository.findById(id).ifPresent(stations -> {
            stations.setNameStation(stationName);
            stationsRepository.save(stations);
        });
    }
    public void deleteStations(int id) {
        stationsRepository.deleteById(id);
    }
}
