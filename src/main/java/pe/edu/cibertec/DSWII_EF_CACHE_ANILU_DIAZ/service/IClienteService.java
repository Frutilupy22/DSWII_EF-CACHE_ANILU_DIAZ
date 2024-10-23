package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service;

import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Cliente;

import java.util.Optional;

public interface IClienteService {
    Optional<Cliente> buscarPorId(Integer id);
}
