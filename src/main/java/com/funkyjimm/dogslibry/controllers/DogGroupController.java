package com.funkyjimm.dogslibry.controllers;

import com.funkyjimm.dogslibry.repositories.DogGroupRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogGroupController {
    DogGroupRepository dogGroupRepository;

    public DogGroupController(DogGroupRepository dogGroupRepository) {
        this.dogGroupRepository = dogGroupRepository;
    }

    @RequestMapping("/groups")
    public String getDogGroups(Model model) {
        model.addAttribute("groups", dogGroupRepository.findAll());
        return "groups";
    }
}
