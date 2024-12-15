package org.example.railwaystationweb.conrollerClasses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {
        @GetMapping("/admin/trains")
        public String showTrains() {
            return "trains";  // Це має посилатися на /src/main/resources/templates/trains.html
        }

        @GetMapping("/admin/cars")
        public String showCars() {
            return "cars";  // Це має посилатися на /src/main/resources/templates/cars.html
        }
        @GetMapping("/admin/seatsCars")
        public String showSeatsCars() {
            return "seatsCars";  // Це має посилатися на /src/main/resources/templates/seatsCars.html
        }

        @GetMapping("/admin/stations")
        public String showStations() {
            return "stations";  // Це має посилатися на /src/main/resources/templates/stations.html
        }
        @GetMapping("/admin/timeTrainStations")
        public String showTimeTrainStations(){
            return "timeTrainStations";
        }
        @GetMapping("/admin/trainsCars")
        public String showTrainCars(){
        return "trainsCars";
        }
        @GetMapping("/admin/trainsStations")
        public String showTrainStation(){
        return "trainsStations";
    }

    }

