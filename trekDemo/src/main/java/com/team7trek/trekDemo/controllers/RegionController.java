package com.team7trek.trekDemo.controllers;


import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class RegionController {
    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayRegions(Model model) {
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsView";
    }
    @RequestMapping("/region")


}

