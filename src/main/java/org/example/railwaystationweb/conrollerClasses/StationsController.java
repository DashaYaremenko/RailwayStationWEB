package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.Stations;
import org.example.railwaystationweb.serverClasses.StationsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class StationsController {

    private final StationsService stationsService;
    public StationsController(StationsService stationsService) {
        this.stationsService = stationsService;
    }
    @GetMapping("/stations")
    public String getAllStations(Model model) {
        List<Stations> stations=stationsService.getAllStations();
        model.addAttribute("stations", stations);
        return "stations";
    }
    // Create
    @PostMapping("/addStations")
    public String addStation(@RequestParam(name = "NameStation") String stationName) {
        stationsService.addStations(stationName);
        return "redirect:/stations";
    }


    // Update
    @PostMapping("/editStation")
    public String updateStation(@RequestParam(name = "ID") int idStation,
                              @RequestParam(name = "NameStation") String stationName) {
        stationsService.updateStations(idStation,stationName);
        return "redirect:/stations";
    }

    // Delete
    @GetMapping("/deleteStation")
    public String deleteStation(@RequestParam int id) {
        stationsService.deleteStations(id);
        return "redirect:/stations";
    }

}
