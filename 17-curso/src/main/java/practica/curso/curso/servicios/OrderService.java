package practica.curso.curso.servicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import practica.curso.curso.Models.Productos;
import practica.curso.curso.Rutas;

import java.util.List;


public class OrderService implements IOrdeService {

    @Value("${misurl.database}")
    private String dataBaseUrl  ;

    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public void saveOrder(List<Productos> productos) {
        System.out.println("Guardando en la base de datos en : " + dataBaseUrl);

        productos.forEach( producto -> logger.debug("El nombre del producto es : {} " , producto.nombre));
    }
}
