package Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        EXTERNA:
        while (true){
            System.out.println("Conversor de monedas");
            System.out.println("1- Soles Peruanos a dolares\n"
                        + "2- Pesos Mexicanos a dolares\n"
                        + "3- Colones Costarricenses a dolares\n"
                        + "4- Salir" );
            System.out.println("Ingese una opcion: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion){
                case '1':
                    convertir(3.58, "Soles Peruanos");
                    break;
                case '2':
                    convertir(22.15, "Pesos Mexicanos");
                    break;
                case '3':
                    convertir(511.42, "Colones Costarricenses");
                    break;
                case '4':
                    System.out.println("Cerrando programa");
                    break EXTERNA;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }

    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de %s :");
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100d ) / 100;


        System.out.println("-----------------------------------------");
        System.out.println("Tienes $ " + dolares+ " Dolares");
        System.out.println("-----------------------------------------");


    }
}
