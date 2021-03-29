package com.funkyjimm.dogslibry.controllers;

import com.funkyjimm.dogslibry.repositories.OriginRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OriginController {
    OriginRepository originRepository;

    public OriginController(OriginRepository originRepository) {
        this.originRepository = originRepository;
    }

    @RequestMapping("/origins")
    public String getOrigins(Model model) {
        model.addAttribute("origins", originRepository.findAll());
        return "origins";
    }
}
