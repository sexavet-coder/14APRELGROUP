package az.developia.spring_project_14aprel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Bu, klasın bir ofisiant (Controller) olduğunu bildirir
public class HomeController {

    @GetMapping("/home") // Brauzerdə /home yazanda bu metod işləyir
    public String showHome() {
        return "home"; // templates qovluğundakı home.html-i tapıb açır
    }
}