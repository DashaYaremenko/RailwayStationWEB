package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.Trains;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainsRepository extends JpaRepository<Trains,Integer> {

}
