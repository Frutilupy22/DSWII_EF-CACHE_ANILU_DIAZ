package pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.model.Evento;
import pe.edu.cibertec.DSWII_EF_CACHE_ANILU_DIAZ.service.IEventoService;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private IEventoService eventoService;


    @GetMapping("/{anio}")
    public ResponseEntity<List<Evento>> obtenerEventosPorAnio(@PathVariable int anio) {
        List<Evento> eventos = eventoService.obtenerEventosPorAnio(anio);
        return ResponseEntity.ok(eventos);
    }
}
