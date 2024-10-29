package practica.curso.curso.myBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practica.curso.curso.Models.Productos;
import practica.curso.curso.servicios.IOrdeService;
import practica.curso.curso.servicios.OrderService;

import java.util.List;

@Configuration
public class PrimerBean {

    @Bean
    public MiBean crearMiBean(){
        return new MiBean() ;
    }

    @Bean
    public IOrdeService instanciarOrderService(){
        boolean esProduccion = false ;
        if(esProduccion){
            return new OrderService() ;
        }{
            return new IOrdeService() {
                @Override
                public void saveOrder(List<Productos> productos) {
                    System.out.println("Guardar en base de datos mock");
                }
            } ;
        }
    }
}
