
package com.ProyectoPaginaWeb.dao;

import com.ProyectoPaginaWeb.domain.Historial;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author leona
 */
public interface HistorialDao extends CrudRepository<Historial, Long> {
 // List<Historial> findByIdCliente(Long idCliente);
    
   // HistorialDetalle findByIdCliente(Long idCliente, Historial historial);
    
   // void deleteByIdCliente(Long idCliente);  
}
