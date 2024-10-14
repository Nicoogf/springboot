
package Persona;


public class EsMayor {
    
    public static int EsMayor( Persona[] persona){
        int mayor = persona[0].getEdad() ;
        int contador = 0 ;
        
       for ( int i = 0 ;  i < persona.length ;i++){
           if( mayor < persona[i].getEdad()){
               mayor = persona[i].getEdad() ;
           }
       }
       return mayor ;
    }
}
