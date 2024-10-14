
package Persona;


public class Persona {
    
    private String nombre ;
    private int edad ;
    
    public Persona ( String nombre , int edad ) {
        this.nombre = nombre ;
        this.edad = edad ;        
    }
    
    public String getNombre(){
        return this.nombre ;
    }
    
    public int getEdad() {
        return this.edad ;
    }
    
    @Override 
    public String toString(){
        return "El nombre es" + nombre + "y tiene" + edad + "anios " ;
    }
}
