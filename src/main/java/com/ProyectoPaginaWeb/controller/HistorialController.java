
package com.ProyectoPaginaWeb.controller;

import com.ProyectoPaginaWeb.dao.HistorialDao;
import com.ProyectoPaginaWeb.domain.Agenda;
import com.ProyectoPaginaWeb.domain.Historial;
import com.ProyectoPaginaWeb.service.AgendaService;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class HistorialController {
    
    @Autowired
    HistorialDao historialDao;
    
    @Autowired 
    AgendaService agendaService;
    
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

    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Agenda agenda, Model model) {
        agenda = agendaService.getAgenda(agenda);
        model.addAttribute("agenda", agenda);
        return "/agenda/reserva";
        
    }

    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Agenda agenda) {
        agendaService.delete(agenda);
        return "redirect:/";
    }
}
