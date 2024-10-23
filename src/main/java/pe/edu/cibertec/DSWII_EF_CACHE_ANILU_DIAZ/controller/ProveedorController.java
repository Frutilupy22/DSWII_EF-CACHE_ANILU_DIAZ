package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Proveedor;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.IProveedorService;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {
    @Autowired
    private IProveedorService proveedorService;

    @GetMapping("/{tipoServicio}")
    public List<Proveedor> obtenerProveedoresPorTipoServicio(@PathVariable String tipoServicio) {
        return proveedorService.obtenerProveedoresPorTipoServicio(tipoServicio);
    }
}
