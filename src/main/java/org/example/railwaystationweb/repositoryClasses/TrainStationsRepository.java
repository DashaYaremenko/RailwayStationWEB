package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.TimeTrainStation;
import org.example.railwaystationweb.dataClass.TrainsStations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainStationsRepository extends JpaRepository<TrainsStations,Integer> {
}
