/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.ProyectoPaginaWeb.controller;

import com.ProyectoPaginaWeb.dao.HistorialDao;
import com.ProyectoPaginaWeb.domain.Historial;
import com.ProyectoPaginaWeb.service.AgendaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author User
 */
@Slf4j
@Controller
public class HistorialController {
    
    @Autowired
    HistorialDao historialDao;
    
    @GetMapping("/historial")
    public String page(Model model) { 
        var lista = historialDao.findAll();
        model.addAttribute("lista", lista);
        return "/historial/consulta";
    } 
    
    @GetMapping("/lista/historial")
    public String Historial(Historial historial){
        return "/historial/consulta";
    }
    
}
