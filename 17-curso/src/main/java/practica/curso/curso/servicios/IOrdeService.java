package practica.curso.curso.servicios;

import org.springframework.stereotype.Service;
import practica.curso.curso.Models.Productos;

import java.util.List;

@Service
public interface IOrdeService {
    public void saveOrder(List<Productos> productos) ;
}
