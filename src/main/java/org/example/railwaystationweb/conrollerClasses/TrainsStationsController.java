package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.*;
import org.example.railwaystationweb.serverClasses.StationsService;
import org.example.railwaystationweb.serverClasses.TrainsService;
import org.example.railwaystationweb.serverClasses.TrainsStationsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;
import java.util.List;

@Controller
@RequestMapping("/")
public class TrainsStationsController {
    private final TrainsStationsService trainsStationsService;
    private final TrainsService trainsService;
    private final StationsService stationsService;

    public TrainsStationsController(TrainsService trainsService, TrainsStationsService trainsStationsService, StationsService stationsService) {
        this.trainsStationsService = trainsStationsService;
        this.trainsService = trainsService;
        this.stationsService = stationsService;
    }
    @GetMapping("/trainsStations")
    public String getAllTrainsStations(Model model) {
        List<TrainsStations> trainsStations=trainsStationsService.getAllTrainsStations();
        List<Trains> trains=trainsService.findAllTrains();
        List<Stations> stations=stationsService.getAllStations();
        model.addAttribute("trainsStations", trainsStations);
        model.addAttribute("trains", trains);
        model.addAttribute("stations", stations);
        return "trainsStations";
    }

    @PostMapping("/addTrainsStation")
    public String addTrainsStations(@RequestParam(name = "TrainID") int trainId,
                                    @RequestParam(name = "StationID") int stationId,
                                    @RequestParam(name = "ArrivTime") LocalTime arrivalTime,
                                    @RequestParam(name = "DeparTime") LocalTime departureTime) {
        trainsStationsService.addTrainsStations(trainId, stationId, arrivalTime, departureTime);
        return "redirect:/trainsStations";
    }

    @PostMapping("/editTrainsStations")
    public String updateTrainsStations(@RequestParam(name = "ID") int id,
                                  @RequestParam(name = "TrainID")int trainId,
                                  @RequestParam(name = "StationID")int stationId,
                                  @RequestParam(name = "ArrivTime") LocalTime arrivalTime,
                                  @RequestParam(name = "DeparTime") LocalTime departureTime) {
        trainsStationsService.updateTrainsStations(id,trainId,stationId,arrivalTime,departureTime);
        return "redirect:/trainsStations";
    }

    @GetMapping("/deleteTrainsStations")
    public String deleteTrainsStations(@RequestParam int id) {
        trainsStationsService.deleteTrainsStations(id);
        return "redirect:/trainsStations";
    }
}
