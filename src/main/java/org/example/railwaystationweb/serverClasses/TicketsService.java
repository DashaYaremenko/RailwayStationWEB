package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.repositoryClasses.*;
import org.springframework.stereotype.Service;

@Service
public class TicketsService {

    private TicketsRepository ticketsRepository;
    private ClientsRepository clientsRepository;
    private TrainsRepository trainsRepository;
    private StationsRepository stationsRepository;
    private TimeTrainStationsRepository timeTrainStationRepository;
    private CarsRepository carsRepository;
    private SeatsCarsRepository seatsCarsRepository;

    public TicketsService(TicketsRepository ticketsRepository,ClientsRepository clientsRepository,
                          TrainsRepository trainsRepository, StationsRepository stationsRepository,
                          TimeTrainStationsRepository timeTrainStationRepository,CarsRepository carsRepository,SeatsCarsRepository seatsCarsRepository) {
        this.ticketsRepository = ticketsRepository;
        this.clientsRepository = clientsRepository;
        this.trainsRepository = trainsRepository;
        this.stationsRepository = stationsRepository;
        this.timeTrainStationRepository = timeTrainStationRepository;
        this.carsRepository = carsRepository;
        this.seatsCarsRepository = seatsCarsRepository;
    }


}
