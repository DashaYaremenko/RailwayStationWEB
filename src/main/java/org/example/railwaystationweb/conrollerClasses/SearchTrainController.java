package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.SearchTrain;
import org.example.railwaystationweb.serverClasses.SearchTrainService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
@RequestMapping("/")
public class SearchTrainController {
    private final SearchTrainService searchTrainService;

    public SearchTrainController(SearchTrainService searchTrainService) {
        this.searchTrainService = searchTrainService;
    }
    @GetMapping("/searchTrain")
    public String showSearchForm() {
        return "searchTrain";
    }

    @PostMapping("/results")
    public String searchTrains(@RequestParam("departureStation") String departureStation,
                               @RequestParam("arrivalStation") String arrivalStation,
                               @RequestParam("departureDate") LocalDate departureDate,
                               Model model) {
        // Викликаємо сервіс для пошуку потягів
        List<SearchTrain> searchTrains = searchTrainService.searchTrains(departureStation, arrivalStation, departureDate);

        // Додаємо результат пошуку в модель
        model.addAttribute("searchTrains", searchTrains);
        return "searchTrain"; // Перехід на сторінку результатів
    }

}
//відновлюю бо забула включити інтернет