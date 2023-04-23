
package com.ProyectoPaginaWeb.service;

import com.ProyectoPaginaWeb.domain.Agenda;
import java.util.List;


public interface AgendaService {
    
    public List<Agenda> getAgenda();

    public Agenda getAgenda(Agenda agenda);

    public void save(Agenda agenda);

    public void delete(Agenda agenda);
}
