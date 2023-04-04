
package com.ProyectoPaginaWeb.service;

import com.ProyectoPaginaWeb.dao.TiendaDao;
import com.ProyectoPaginaWeb.domain.Tienda;
import com.ProyectoPaginaWeb.domain.Tienda;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author leona
 */
@Service
public class TiendaServiceImpl implements TiendaService{
    
    @Autowired
    TiendaDao tiendaDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Tienda> getTiendas(double precio) {
        return (List<Tienda>)tiendaDao.findAll();
    }
    
    @Override
    @Transactional (readOnly = true)
    public Tienda getTienda(Tienda tienda) {
        return tiendaDao.findById(tienda.getIdArticulo()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Tienda tienda) {
        tiendaDao.save(tienda);
    }
    
    @Override
    @Transactional
    public void delete(Tienda tienda) {
        tiendaDao.deleteById(tienda.getIdArticulo());
    }
    
}
