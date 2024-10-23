package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Evento;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento,Integer> {
    @Query("SELECT e FROM Evento e WHERE FUNCTION('YEAR', e.fecha) = :anio")
    List<Evento> obtenerEventosPorAnio(@Param("anio") int anio);
}
