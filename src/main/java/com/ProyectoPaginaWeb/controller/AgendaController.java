/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.ProyectoPaginaWeb.controller;

import com.ProyectoPaginaWeb.domain.Agenda;
import com.ProyectoPaginaWeb.service.AgendaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author User
 */
@Slf4j
@Controller
public class AgendaController {
    
    @Autowired
    AgendaService agendaService;
    
    @GetMapping("/agenda")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/agenda";
    }
    
    @GetMapping("/agenda/nuevo")
    public String nuevoCita(Agenda agenda){
        return "/agenda/reserva";
    }
    
    @PostMapping("/agenda/guardar")
    public String guardarCita(Agenda agenda){
        agendaService.save(agenda);
        return "redirect:/agenda";
    }
    
}
