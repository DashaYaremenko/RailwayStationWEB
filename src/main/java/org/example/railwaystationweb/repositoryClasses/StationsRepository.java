package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.Stations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationsRepository extends JpaRepository<Stations, Integer> {
}
