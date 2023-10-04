import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        int a = entrada.nextInt();
        System.out.println("Introduce el valor de b: ");
        int b = entrada.nextInt();
        System.out.println("Introduce el valor de c: ");
        int c = entrada.nextInt();

        entrada.close();

        int CuentaA = a*b+c*(3-2/2*b);
        int CuentaB = (2+a*b/4)^c+2;
        // La cuenta c no la hago porque no sé poner la raiz cuadrada

        System.out.println("El valor de la primera cuenta es: "+ CuentaA + " el valor de la segunda cuenta es: "+ CuentaB);

    }
}
