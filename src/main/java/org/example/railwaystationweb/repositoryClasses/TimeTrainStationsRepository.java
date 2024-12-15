package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.TimeTrainStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface TimeTrainStationsRepository extends JpaRepository<TimeTrainStation,Integer> {

}
