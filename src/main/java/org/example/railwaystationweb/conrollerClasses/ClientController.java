package org.example.railwaystationweb.conrollerClasses;

import org.example.railwaystationweb.dataClass.Clients;
import org.example.railwaystationweb.serverClasses.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ClientController {
    private ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/searchTrain")
    public String showSearchTrain() {
        return "searchTrain";
    }
    @GetMapping("/client/buyTicket")
    public String showBuyTicket() {
        return "buyTicket";
    }

    @PostMapping("/create")
    public String addNewClient(@RequestParam String lastName, @RequestParam String firstName, @RequestParam String typeDoc) {
        clientService.addNewClient(lastName,firstName,typeDoc);
        return "redirect:/clients";

    }


}
