import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {

        String patente ="";
        int tipoDeEstacionamiento , cantHoras ,cont1 = 0 , cont2 = 0 , cont3 = 0;
        double total , totalDia=0;
        Scanner input = new Scanner(System.in) ;

        while(!patente.equalsIgnoreCase("fin")){
                System.out.println("Ingresar patente del vehiculo : ");
                patente = input.nextLine();
                if(!patente.equalsIgnoreCase("fin")) {
                System.out.println("Ingresar tipo de servicio");
                System.out.println("   1-Por Hora");
                System.out.println("   2-PartTime (5 Horas)");
                System.out.println("   3-PartTime (10 Horas)");
                input = new Scanner(System.in);
                tipoDeEstacionamiento = input.nextInt();

                if (tipoDeEstacionamiento > 3 || tipoDeEstacionamiento <= 0) {
                    System.out.println("No ingreso una opcion valida");
                } else {
                    if (tipoDeEstacionamiento == 1) {
                        System.out.println("Ingresar cantidad de horas que desea estacionar");
                        input = new Scanner(System.in);
                        cantHoras = input.nextInt();
                        total = cantHoras * 3;
                        System.out.println("Debe abonar : $" + total);
                        cont1++;
                        totalDia += total;

                    } else {
                        if (tipoDeEstacionamiento == 2) {
                            total = 15 - (15 * 0.05);
                            System.out.println("Debe abonar : $" + total);
                            cont2++;
                            totalDia += total;

                        } else {
                            total = 30 - (30 * 0.10);
                            System.out.println("Debe abonar : $" + total);
                            cont3++;
                            totalDia += total;

                        }
                    }

                }
                System.out.println("***     Muchas gracias por su compra     ***");
                input = new Scanner(System.in);
            }
        }
        System.out.println("===============================");
        System.out.println("Totales monetarios del dia : $" + totalDia + "usd");
        System.out.println("Cantidad servicios por hora : " + cont1);
        System.out.println("Cantidad servicios por PartTime : " + cont2);
        System.out.println("Cantidad servicios por FullTime : " + cont3);
    }
}
