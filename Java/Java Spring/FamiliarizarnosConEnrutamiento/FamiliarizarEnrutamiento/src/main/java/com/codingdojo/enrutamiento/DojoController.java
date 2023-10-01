package com.codingdojo.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
    @RequestMapping("/dojo")
    public String dojo() {
        return "¡El Dojo es increíble!";
    }

    @RequestMapping("/burbank-dojo")
    public String burbankDojo() {
        return "El Dojo Burbank está localizado al sur de California";
    }

    @RequestMapping("/san-jose")
    public String sanJose() {
        return "El Dojo SJ es el cuartel general";
    }
}
