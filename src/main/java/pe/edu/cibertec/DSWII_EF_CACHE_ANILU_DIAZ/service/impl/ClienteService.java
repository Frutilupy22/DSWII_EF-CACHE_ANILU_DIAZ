package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Cliente;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.IClienteService;

import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    @Cacheable(value = "clientes", key = "#id")
    public Optional<Cliente> buscarPorId(Integer id) {
        return clienteRepository.findById(id);
    }
}
