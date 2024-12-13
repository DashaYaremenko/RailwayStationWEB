package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.Trains;
import org.example.railwaystationweb.serverClasses.TrainsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class TrainsController {

    private final TrainsService trainService;

    public TrainsController(TrainsService trainService) {
        this.trainService = trainService;
    }

    // Read (all)
    @GetMapping("/trains")
    public String getAllTrains(Model model) {
        List<Trains> trains=trainService.findAllTrains();
        model.addAttribute("trains", trains);
        return "trains";
    }
    // Create
    @PostMapping("/addTrains")
    public String addTrain(@RequestParam(name = "NameMar") String nameMar, @RequestParam(name = "TypeTrain")String typeTrain) {
        trainService.addTrain(nameMar, typeTrain);
        return "redirect:/trains";
    }


    // Update
    @PostMapping("/editTrain")
    public String updateTrain(@RequestParam(name = "ID") int idTrain,
                              @RequestParam(name = "NameMar") String nameMar,
                              @RequestParam(name = "TypeTrain")String typeTrain) {
        trainService.updateTrain(idTrain,nameMar,typeTrain);
        return "redirect:/trains";
    }

    // Delete
    @GetMapping("/deleteTrain")
    public String deleteTrain(@RequestParam int id) {
        trainService.deleteTrain(id);
        return "redirect:/trains";
    }


}

