package practica.curso.curso.myBeans;

import org.springframework.stereotype.Component;

@Component
public class MiComponente {
    public void saludarDesdeComponente(){
        System.out.println("Saludo desde la anotacion componente");
    }
}
