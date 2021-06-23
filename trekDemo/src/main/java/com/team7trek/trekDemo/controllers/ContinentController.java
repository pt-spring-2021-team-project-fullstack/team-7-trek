package com.team7trek.trekDemo.controllers;

import com.team7trek.trekDemo.models.Continent;
import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.repositories.ContinentRepository;

import com.team7trek.trekDemo.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ContinentController {
    @Resource
    private ContinentRepository continentRepo;

    @RequestMapping({"/continents", "/", ""})
    public String displayContinents(Model model) {
        model.addAttribute("continents", continentRepo.findAll());
        return "continentsView";
    }

    @GetMapping("continents/{title}")
    public String displaySingleContinent(@PathVariable String title, Model model) {
        Continent retrievedContinent = continentRepo.findContinentByTitle(title);
        model.addAttribute("continent", retrievedContinent);
        return "continentView";
    }
}
