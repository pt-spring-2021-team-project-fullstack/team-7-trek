package com.team7trek.trekDemo.controllers;


import com.team7trek.trekDemo.repositories.TrekRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class TrekController {
    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("treks", trekRepo.findAll());
        return "treksView";
    }
    @RequestMapping("/trek")
    public String displayTrek(@RequestParam Long id,Model model ){
        model.addAttribute("trekTitle",trekRepo.findById(id).get());
        return "trekView";
    }
}
