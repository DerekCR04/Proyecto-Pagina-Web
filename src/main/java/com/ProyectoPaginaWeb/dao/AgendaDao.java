/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoPaginaWeb.dao;

import com.ProyectoPaginaWeb.domain.Agenda;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface AgendaDao extends CrudRepository<Agenda, Long>{
    
}
