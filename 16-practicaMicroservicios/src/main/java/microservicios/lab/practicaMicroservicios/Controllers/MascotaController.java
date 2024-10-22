package microservicios.lab.practicaMicroservicios.Controllers;

import microservicios.lab.practicaMicroservicios.Models.Mascota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/mascota")
public class MascotaController {
    private final AtomicLong counter = new AtomicLong() ;
    private static final String template = "La mascota encontrada es %s" ;

    @GetMapping
    public Mascota getMascota(@RequestParam(value = "name" , defaultValue = "random") String nombre){
        return new Mascota( counter.incrementAndGet() , String.format(template,nombre) , "Perro") ;
    }
}
