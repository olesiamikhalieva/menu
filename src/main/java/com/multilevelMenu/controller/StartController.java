package com.multilevelMenu.controller;

import com.multilevelMenu.service.Level_1_Service;
import com.multilevelMenu.service.Level_2_Service;
import com.multilevelMenu.service.Level_3_Service;
import com.multilevelMenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StartController {
    @Autowired
    private Level_1_Service level_1_service;
    @Autowired
    private Level_2_Service level_2_service;
    @Autowired
    private Level_3_Service level_3_service;
    @Autowired
    private MenuService menuService;

    @RequestMapping(method = RequestMethod.GET)
    public String getMain(Model model) {
        model.addAttribute("level_1_list", level_1_service.getAll());
        model.addAttribute("level_2_list", level_2_service.getAll());
        model.addAttribute("level_3_list", level_3_service.getAll());
        return "menu";
    }

}
