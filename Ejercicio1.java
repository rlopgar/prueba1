import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        double a = entrada.nextDouble();
        System.out.println("Introduce el valor de b: ");
        double b = entrada.nextDouble();
        System.out.println("Introduce el valor de c: ");
        double c = entrada.nextDouble();

        entrada.close();

        double CuentaA = a*b+c*((3-2)/(2*b));
        double CuentaB = ((2+a*b)/4)^c+2); // Por lo que tengo entendido es que no me deja usar double para hacer potencias, no sé arreglarlo.
        // La cuenta c no la hago porque no sé poner la raiz cuadrada

        System.out.println("El valor de la primera cuenta es: "+ CuentaA + " el valor de la segunda cuenta es: "+ CuentaB);

    }
}
