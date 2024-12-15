package org.example.railwaystationweb.conrollerClasses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MenuController {
    @GetMapping("/menu")
    public String showMenu() {
        return "menu";  // This will resolve to /src/main/resources/templates/menu.html
    }
    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";  // Thymeleaf шукає шаблон в /src/main/resources/templates/admin.html
    }

}