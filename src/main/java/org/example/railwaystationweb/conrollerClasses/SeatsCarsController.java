package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.Cars;
import org.example.railwaystationweb.dataClass.SeatsCars;
import org.example.railwaystationweb.serverClasses.CarsService;
import org.example.railwaystationweb.serverClasses.SeatsCarsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/")
public class SeatsCarsController {
    private final CarsService carsService;
    private final SeatsCarsService seatsCarsService;

    public SeatsCarsController(CarsService carsService, SeatsCarsService seatsCarsService) {
        this.carsService = carsService;
        this.seatsCarsService = seatsCarsService;
    }
    @GetMapping("/seatsCars")
    public String getAllSeatsCars(Model model) {
        List<SeatsCars> seatsCars=seatsCarsService.getAllSeatsCars();
        List<Cars> cars=carsService.getAllCars();
        model.addAttribute("seatsCars", seatsCars);
        model.addAttribute("cars", cars);
        return "seatsCars";
    }

    @PostMapping("/addSeatsCars")
    public String addSeatsCars(@RequestParam(name = "CarsID")int carsId,
                               @RequestParam(name = "SeatNumber")int seatsNum,
                               @RequestParam(name = "StatusSeat") SeatsCars.StatusSeat statusSeat) {
        seatsCarsService.addSeatsCars(carsId, seatsNum, statusSeat);
        return "redirect:/seatsCars";
    }

    @PostMapping("/editSeatsCars")
    public String updateSeatsCars(@RequestParam(name = "ID") int id,
                                  @RequestParam(name = "CarsID")int carsId,
                                  @RequestParam(name = "SeatNumber")int seatsNum,
                                  @RequestParam(name = "StatusSeat") SeatsCars.StatusSeat statusSeat) {
        seatsCarsService.updateSeatsCars(id,carsId, seatsNum, statusSeat);
        return "redirect:/seatsCars";
    }

    @GetMapping("/deleteSeatsCars")
    public String deleteSeatsCars(@RequestParam int id) {
        seatsCarsService.deleteSeatsCars(id);
        return "redirect:/seatsCars";
    }
}
