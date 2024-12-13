package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Integer> {

}
