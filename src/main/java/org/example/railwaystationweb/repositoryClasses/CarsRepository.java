package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository <Cars, Integer> {
}
