package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service;

import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Evento;

import java.util.List;

public interface IEventoService {
    List<Evento> obtenerEventosPorAnio(int anio);
}
