/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.ProyectoPaginaWeb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author User
 */
@Slf4j
@Controller
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    
}
