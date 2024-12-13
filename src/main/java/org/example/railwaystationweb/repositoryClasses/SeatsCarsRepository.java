package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.SeatsCars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsCarsRepository extends JpaRepository <SeatsCars,Integer> {

}
