package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.TimeTrainStation;
import org.example.railwaystationweb.dataClass.TrainsStations;
import org.example.railwaystationweb.serverClasses.TimeTrainStationService;
import org.example.railwaystationweb.serverClasses.TrainsStationsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/")
public class TimeTrainStationsController {
    private final TimeTrainStationService timeTrainStationService;
    private final TrainsStationsService trainStationsService;

    public TimeTrainStationsController(TimeTrainStationService timeTrainStationService, TrainsStationsService trainStationsService) {
        this.timeTrainStationService = timeTrainStationService;
        this.trainStationsService = trainStationsService;
    }

    @GetMapping("/timeTrainStations")
    public String getTimeTrainStations(Model model) {
        List<TimeTrainStation> timeTrainStations = timeTrainStationService.getAllTimeTrainStations();
        List<TrainsStations> trainsStations = trainStationsService.getAllTrainsStations();
        model.addAttribute("timeTrainStations", timeTrainStations);
        model.addAttribute("trainsStations", trainsStations);
        return "timeTrainStations";
    }

    @PostMapping("/addTimeTrainStation")
    public String addTimeTrainStations(@RequestParam(name = "DeparDate") LocalDate departureDate,
                                       @RequestParam(name = "DeparStationTime") int departureTimeStationId,
                                       @RequestParam(name = "ArrivDate") LocalDate arrivalDate,
                                       @RequestParam(name = "ArrivStationTime") int arrivalTimeStationId) {
        timeTrainStationService.addTimeTrainStation(departureDate,departureTimeStationId,arrivalDate,arrivalTimeStationId);
        return "redirect:/timeTrainStations";
    }
    @PostMapping("/editTimeTrainStation")
    public String updateTimeTrainStations(@RequestParam(name = "ID") int id,
                                          @RequestParam(name = "DeparDate") LocalDate departureDate,
                                          @RequestParam(name = "DeparStationTime") int departureTimeStationId,
                                          @RequestParam(name = "ArrivDate") LocalDate arrivalDate,
                                          @RequestParam(name = "ArrivStationTime") int arrivalTimeStationId) {
        timeTrainStationService.updateTimeTrainStation(id,departureDate,departureTimeStationId,arrivalDate,arrivalTimeStationId);
        return "redirect:/timeTrainStations";
    }
    @GetMapping("/deleteTimeTrainStation")
     public String deleteTimeTrainStations(@RequestParam(name = "ID") int id) {
        timeTrainStationService.deleteTimeTrainStation(id);
        return "redirect:/timeTrainStations";
     }

}
//jjj
