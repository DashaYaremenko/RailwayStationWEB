package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.TimeTrainStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTrainStationsRepository extends JpaRepository<TimeTrainStation,Integer> {
}
