package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service;

import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Proveedor;

import java.util.List;

public interface IProveedorService {
    List<Proveedor> obtenerProveedoresPorTipoServicio(String tipoServicio);
}
