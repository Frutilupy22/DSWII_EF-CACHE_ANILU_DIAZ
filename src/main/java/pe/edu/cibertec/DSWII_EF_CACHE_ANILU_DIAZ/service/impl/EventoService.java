package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Evento;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.repository.EventoRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.IEventoService;

import java.util.List;

@Service
public class EventoService implements IEventoService {
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    @Cacheable(value = "eventosPorAnio", key = "#anio")
    public List<Evento> obtenerEventosPorAnio(int anio) {
        return eventoRepository.obtenerEventosPorAnio(anio);
    }
}
