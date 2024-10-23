package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Cliente;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.IClienteService;

import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final IClienteService clienteService;

    public ClienteController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public Optional<Cliente> obtenerClientePorId(@PathVariable Integer id) {
        return clienteService.buscarPorId(id);
    }
}
