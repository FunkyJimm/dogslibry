package com.funkyjimm.dogslibry.controllers;

import com.funkyjimm.dogslibry.repositories.ClassificationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassificationController {
    ClassificationRepository classificationRepository;

    public ClassificationController(ClassificationRepository classificationRepository) {
        this.classificationRepository = classificationRepository;
    }

    @RequestMapping("/classifications")
    public String getClassifications(Model model) {
        model.addAttribute("classifications", classificationRepository.findAll());
        return "classifications";
    }
}
