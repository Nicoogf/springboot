package practica.curso.curso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practica.curso.curso.Models.Cancion;
import practica.curso.curso.Models.Libro;
import practica.curso.curso.Models.Productos;
import practica.curso.curso.Models.UserData;
import practica.curso.curso.myBeans.MiBean;
import practica.curso.curso.myBeans.MiComponente;
import practica.curso.curso.servicios.IOrdeService;

import java.util.List;
import java.util.Map;

@RestController

public class Rutas {
    private IOrdeService orderService ;
    private MiBean miBean ;
    private MiComponente miComponente ;
    @Autowired



    public Rutas(IOrdeService orderService , MiBean miBean , MiComponente miComponente){
        this.orderService = orderService ;
        this.miBean = miBean ;
        this.miComponente = miComponente;
    }

    private final Logger logger = LoggerFactory.getLogger(Rutas.class) ;


   @GetMapping(value ="/hola")
    public String getSaludo(){
       return "Bienvenido a la api";
   }

   @GetMapping(value = "/hola/{name}")
    public String getSaludoPersonalizado(@PathVariable String name) {
       return "Bienvendido a la API " + name ;
   }

   @GetMapping( value = "/hola/{name}/{editorial}" )
    public String saludoEditorial(@PathVariable String name , String editorial){
       return "Bienvenido a la editorial : " + editorial + "Muchas gracias " + name ;
   }

   @GetMapping(value = "/hola2/{id}/")
    public String obtenerLibro(@PathVariable int id , @RequestParam String gato , @RequestParam String editorial){
       return "Bienvenido a la ruta del usuario : " + id + " y su query params es : " + gato + " con editorial " + editorial;
   }

   @PostMapping("/libros")
    public String GuardarLibro(@RequestBody Libro libro){
         logger.debug("nombre {}  editorial {}" , libro.nombre , libro.editorial);
       return "Libro guardado";
   }

 @PostMapping("/cancion")
    public String GuardarCancion(@RequestBody Cancion cancion){
    logger.debug("nombre {}  artista{}  album {}" , cancion.name ,cancion.artist ,cancion.album);
    return "Agregaste " + cancion.name ;
 }

 @GetMapping(value ="/holados")
 @ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY , reason = "La ruta fue movida")
    public String segundaRutaConStatus(){
        return "Aprendiendo status en spring";
    }

    @GetMapping(value ="/animales/{lugar}")
    public ResponseEntity<String> getAnimales(@PathVariable String lugar){
        if (lugar.equalsIgnoreCase("granja")) {
            return ResponseEntity.status(HttpStatus.OK).body("Caballo, vaca , gallina");
        }else if(lugar.equalsIgnoreCase("selva")){
            return ResponseEntity.status(HttpStatus.OK).body("Mono , Gorila , Puma");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Lugar no valido");
        }
    }

    @GetMapping("/calcular/{numero}")
    public int getCalculo(@PathVariable int numero) {
       throw new NullPointerException("La clave del usuario es password123 y no deberia leerse en postman");
    }

    /*
    @GetMapping("/userdata")
    public ResponseEntity<String> getDataUser(){
       return  ResponseEntity.status(HttpStatus.OK)
               .header("Content-Type" , "application/json")
               .body("{\"name\": \"mary\"}");
    }
*/

/*
 @GetMapping("/userdatados")
    public Map<String, Map<String, Object>> getUserDataDos() {
       return Map.of("user" , Map.of("name" ,"mary" , "age" , 25)) ;
    }
*/
    @GetMapping("/userdatatres")
    public UserData getUserDataTres(){
        return new UserData ("mary" , 25 , "calle 20") ;
    }

    @PostMapping("/order")
    public String createOrder(@RequestBody List<Productos> products) {
        orderService.saveOrder(products);
        return "Productos guardados" ;
    }

    @GetMapping("/saludarbean")
    public String saludoBean(){
       miBean.saludar() ;
       return "Completado" ;
    }

    @GetMapping("/saludocomponente")
    public String saludoComponente() {
        miComponente.saludarDesdeComponente();
        return "Completado" ;
    }
}
