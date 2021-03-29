package com.funkyjimm.dogslibry.controllers;

import com.funkyjimm.dogslibry.repositories.DogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {
    DogRepository dogRepository;

    public DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @RequestMapping("/dogs")
    public String getDogs(Model model) {
        model.addAttribute("dogs", dogRepository.findAll());
        return "dogs";
    }
}
