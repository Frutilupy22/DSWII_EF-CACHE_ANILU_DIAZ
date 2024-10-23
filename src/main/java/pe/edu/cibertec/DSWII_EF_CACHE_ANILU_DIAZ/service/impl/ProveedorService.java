package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Proveedor;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.repository.ProveedorRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.IProveedorService;

import java.util.List;

@Service
public class ProveedorService implements IProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    @Cacheable(value = "proveedoresPorTipoServicio", key = "#tipoServicio")
    public List<Proveedor> obtenerProveedoresPorTipoServicio(String tipoServicio) {
        return proveedorRepository.obtenerProveedoresPorTipoServicio(tipoServicio);
    }
}
