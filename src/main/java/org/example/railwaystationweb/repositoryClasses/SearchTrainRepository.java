package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.SearchTrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SearchTrainRepository extends JpaRepository<SearchTrain, Integer> {
    @Query("SELECT new org.example.railwaystationweb.dataClass.SearchTrain(" +
            "        t.id, " +
            "        t.nameMar, " +
            "        s1.nameStation, " +
            "        ts.deparDate, " +
            "        ts.deparStationTime.departureTime, " +
            "        s2.nameStation, " +
            "        ts.arrivDate, " +
            "        ts.arrivStationTime.arrivalTime, " +
            "        c.typeCars, " +
            "        COUNT(sc.id)" +
            "    )" +
            "FROM Trains t " +
            "JOIN TrainsStations trainStation1 ON trainStation1.trainID.id = t.id " +
            "JOIN Stations s1 ON trainStation1.stationID.id = s1.id " +
            "JOIN TimeTrainStation ts ON ts.deparStationTime.id = trainStation1.id " +
            "JOIN TrainsStations trainStation2 ON trainStation2.trainID.id = t.id " +
            "JOIN Stations s2 ON trainStation2.stationID.id = s2.id " +
            "JOIN TrainCars tc ON tc.trainsID.id = t.id " +
            "JOIN Cars c ON c.id = tc.carsID.id " +
            "JOIN SeatsCars sc ON sc.carsID.id = c.id " +
            "WHERE s1.nameStation = :departureStation " +
            "AND s2.nameStation = :arrivalStation " +
            "AND ts.deparDate = :departureDate " +
            "AND sc.statusSeat = 'Доступне' " +
            "GROUP BY t.id, t.nameMar, s1.nameStation, ts.deparDate, ts.deparStationTime.departureTime, " +
            "         s2.nameStation, ts.arrivDate, ts.arrivStationTime.arrivalTime, c.typeCars")
    List<SearchTrain> findSearchTrain(@Param("departureStation") String departureStation,
                                      @Param("arrivalStation") String arrivalStation,
                                      @Param("departureDate") LocalDate departureDate);
}


//відновлюю бо забула включити інтернет
