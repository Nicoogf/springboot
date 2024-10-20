import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isFin = false ;
        String patente = "" ;
        int tipoDeEstacionamiento ;



        System.out.println("Gestor de estacionamiento");

        while(isFin == false ) {
            System.out.println("Ingrese patente del vehiculo");
            patente = input.nextLine() ;
            if( !patente.equalsIgnoreCase("fin") ){
                System.out.println("Ingrese el tipo de Estacionamiento");
                System.out.println("1-Valor por hora");
                System.out.println("2-Valor por media jornada");
                System.out.println("3-Valor por valor por jornada completa");
                tipoDeEstacionamiento = input.nextInt();

            }else{
                System.out.println("Fin del programa");
                isFin = true ;
            }

        }

        System.out.println("Fin del programa");






    }
}
