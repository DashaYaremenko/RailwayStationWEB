package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.SearchTrain;
import org.example.railwaystationweb.repositoryClasses.SearchTrainRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SearchTrainService {
    private final SearchTrainRepository searchTrainRepository;

    public SearchTrainService(SearchTrainRepository searchTrainRepository) {
        this.searchTrainRepository = searchTrainRepository;
    }

    public List<SearchTrain> searchTrains(String departureStation, String arrivalStation, LocalDate departureDate) {
        return searchTrainRepository.findSearchTrain(departureStation, arrivalStation, departureDate);
    }
}
//відновлюю бо забула включити інтернет