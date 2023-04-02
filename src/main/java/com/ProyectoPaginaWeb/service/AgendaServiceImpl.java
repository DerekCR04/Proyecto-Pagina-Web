/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoPaginaWeb.service;

import com.ProyectoPaginaWeb.dao.AgendaDao;
import com.ProyectoPaginaWeb.domain.Agenda;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
public class AgendaServiceImpl implements AgendaService{
    
    @Autowired
    AgendaDao agendaDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Agenda> getAgenda() {
        return (List<Agenda>)agendaDao.findAll();
    }
    
    @Override
    @Transactional (readOnly = true)
    public Agenda getAgenda(Agenda agenda) {
        return agendaDao.findById(agenda.getIdCliente()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Agenda agenda) {
        agendaDao.save(agenda);
    }
    
    @Override
    @Transactional
    public void delete(Agenda agenda) {
        agendaDao.deleteById(agenda.getIdCliente());
    }
}
