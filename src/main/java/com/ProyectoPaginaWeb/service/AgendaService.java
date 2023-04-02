/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoPaginaWeb.service;

import com.ProyectoPaginaWeb.domain.Agenda;
import java.util.List;

/**
 *
 * @author User
 */
public interface AgendaService {
    
    public List<Agenda> getAgenda();

    public Agenda getAgenda(Agenda agenda);

    public void save(Agenda agenda);

    public void delete(Agenda agenda);
}
