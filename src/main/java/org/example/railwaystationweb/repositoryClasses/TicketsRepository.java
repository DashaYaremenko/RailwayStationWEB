package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository  extends JpaRepository<Tickets, Integer> {

}
