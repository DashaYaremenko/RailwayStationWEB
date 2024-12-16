package org.example.railwaystationweb.repositoryClasses;

import org.example.railwaystationweb.dataClass.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TicketsRepository  extends JpaRepository<Tickets, Integer> {

}
