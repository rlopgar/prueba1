import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Introduce los grados :");

        double Grados = entrada.nextDouble();

        double f = (9/5)*Grados+32;
        double k = Grados+273.15;

        System.out.println("La temperatura en grados Fahrenheit es: "+ f + " y la temperatura en grados Kelvin es : "+k);

        //Sé que pides al introducir una tecla que dé un resultado, pero no sé expresarlo (Me he jodido bastante por perder clases gracias al covid)




    }

}
