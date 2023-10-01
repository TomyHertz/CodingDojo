package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller

public class CounterController {
    @GetMapping("/counter")
    
    public String showCounter(HttpSession session, Model model) {
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 0;
        }

        model.addAttribute("count", count);
        return "counter";
    }

    @GetMapping("/increment")
    public String incrementCounter(HttpSession session) {
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 0;
        }

        count++;
        session.setAttribute("count", count);

        return "redirect:/counter";
    }

    @GetMapping("/reset")
    public String resetCounter(HttpSession session) {
        session.getAttribute("count");
        return "redirect:/counter";
    }
}
