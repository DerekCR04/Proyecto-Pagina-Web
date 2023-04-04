package com.ProyectoPaginaWeb.service;

import com.ProyectoPaginaWeb.domain.Tienda;
import java.util.List;

/**
 *
 * @author leona
 */
public interface TiendaService {

    public List<Tienda> getTiendas(double precio);

    public Tienda getTienda(Tienda tienda);

    public void save(Tienda tienda);

    public void delete(Tienda tienda);

}
