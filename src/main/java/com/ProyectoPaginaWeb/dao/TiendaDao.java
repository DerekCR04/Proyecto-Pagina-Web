
package com.ProyectoPaginaWeb.dao;

import com.ProyectoPaginaWeb.domain.Agenda;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author leona
 */
public interface TiendaDao extends CrudRepository<Agenda, Long> {
    
}
