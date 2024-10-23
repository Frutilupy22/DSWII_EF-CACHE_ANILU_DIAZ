package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Proveedor;

import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    @Query("SELECT p FROM Proveedor p WHERE p.tipoServicio = :tipoServicio")
    List<Proveedor> obtenerProveedoresPorTipoServicio(@Param("tipoServicio") String tipoServicio);
}
