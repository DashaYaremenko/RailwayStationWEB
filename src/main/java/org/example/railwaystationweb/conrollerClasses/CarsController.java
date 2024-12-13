package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.Cars;
import org.example.railwaystationweb.serverClasses.CarsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    private final CarsService carsService;
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }
    @GetMapping("/cars")
    public String getAllCars(Model model) {
        List<Cars> cars=carsService.getAllCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
    // Create
    @PostMapping("/addCars")
    public String addCars(@RequestParam(name = "TypeCars") String typeCar,@RequestParam(name = "NumSeats") int numSeats) {
        carsService.addCars(typeCar,numSeats);
        return "redirect:/cars";
    }

    // Update
    @PostMapping("/editCars")
    public String updateStation(@RequestParam(name = "ID") int idCar,
                                @RequestParam(name = "TypeCars") String typeCar,
                                @RequestParam(name = "NumSeats") int numSeats) {
        carsService.updateCars(idCar,typeCar,numSeats);
        return "redirect:/cars";
    }

    // Delete
    @GetMapping("/deleteCars")
    public String deleteCars(@RequestParam int id) {
        carsService.deleteCars(id);
        return "redirect:/cars";
    }
}
