package edu.school21.cinema.controller;

import edu.school21.cinema.model.HallModel;
import edu.school21.cinema.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/panel")
public class CinemaController {

    private final HallService hallService;

    @Autowired
    public CinemaController(HallService hallService) {
        this.hallService = hallService;
    }

    @GetMapping("/halls")
    public String getHallList(){
        List<HallModel> halls = hallService.getHalls();
//        model.addAttribute("halls", halls);

        halls.forEach(System.out::println);

        return "halls";
    }
}
