package com.example.Pogonyalo.controller;

import com.example.Pogonyalo.model.Prisoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Pogonyalo.service.PrisonerService;

import java.util.List;

@Controller
public class PrisonerController {

    private PrisonerService prisonerService;

    @Autowired
    public PrisonerController(PrisonerService prisonerService) {
        this.prisonerService = prisonerService;

    }

    @GetMapping(value = "/prisoners")
    @ResponseBody
    public List<Prisoner> getAllPrisoners() {
        return prisonerService.getAll();
    }
}
