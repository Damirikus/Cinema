package ru.damirikus.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.damirikus.cinema.model.Hall;
import ru.damirikus.cinema.service.HallService;

import java.util.List;

@Controller
@RequestMapping("/admin/panel")
public class CinemaController {

    private final HallService service;

    public CinemaController(HallService service) {
        this.service = service;
    }

    @GetMapping("/halls")
    public String getHallList(Model model){

        List<Hall> halls = service.getHalls();
        model.addAttribute("halls", halls);

        return "halls";
    }

//    @PostMapping
//    public String addHall(){
//
//    }
}
