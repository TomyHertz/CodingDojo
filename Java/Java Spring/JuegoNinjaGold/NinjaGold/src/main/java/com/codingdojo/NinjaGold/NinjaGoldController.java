package com.codingdojo.NinjaGold;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class NinjaGoldController {
    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }

        int gold = (int) session.getAttribute("gold");
        List<String> activities = (List<String>) session.getAttribute("activities");

        model.addAttribute("gold", gold);
        model.addAttribute("activities", activities);
        return "index";
    }

    @PostMapping("/process")
    public String process(HttpSession session) {
        int gold = (int) session.getAttribute("gold");
        List<String> activities = (List<String>) session.getAttribute("activities");

        String place = "";
        int earnedGold = 0;

        Random random = new Random();
        int randomNum = 0;

        String timeStamp = LocalDateTime.now().toString();

        switch (place) {
            case "farm":
                randomNum = random.nextInt(11) + 10;
                earnedGold = randomNum;
                break;
            case "cave":
                randomNum = random.nextInt(6) + 5;
                earnedGold = randomNum;
                break;
            case "house":
                randomNum = random.nextInt(4) + 2;
                earnedGold = randomNum;
                break;
            case "casino":
                randomNum = random.nextInt(101);
                int chance = random.nextInt(2);

                if (chance == 0) {
                    earnedGold = randomNum;
                } else {
                    earnedGold = -randomNum;
                }
                break;
            // Add more places if needed
        }

        gold += earnedGold;
        activities.add("You entered a " + place + " and " + (earnedGold >= 0 ? "earned" : "lost") + " " + Math.abs(earnedGold) + " gold. (" + timeStamp + ")");

        session.setAttribute("gold", gold);
        session.setAttribute("activities", activities);

        return "redirect:/";
    }
}
