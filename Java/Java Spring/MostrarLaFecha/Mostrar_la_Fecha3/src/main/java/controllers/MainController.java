package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/date")
    public String currentDate(Model model) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d 'de' MMMM, yyyy");
        String formattedDate = dateFormat.format(date);
        model.addAttribute("formattedDate", formattedDate);
        return "date";
    }

    @GetMapping("/time")
    public String currentTime(Model model) {
        Date date = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        String formattedTime = timeFormat.format(date);
        model.addAttribute("formattedTime", formattedTime);
        return "time";
    }
}	
