package practica.curso.curso.servicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import practica.curso.curso.Models.Productos;
import practica.curso.curso.Rutas;

import java.util.List;


public class OrderService implements IOrdeService {

    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public void saveOrder(List<Productos> productos) {
        System.out.println("Guardando en la base de datos");

        productos.forEach( producto -> logger.debug("El nombre del producto es : {} " , producto.nombre));
    }
}
