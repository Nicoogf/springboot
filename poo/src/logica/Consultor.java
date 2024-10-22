package logica;

public class Consultor extends Persona{
    String nombre_consultora ;
    int num_consultor ;

    public Consultor() {
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombre_consultora, int num_consultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }
}
