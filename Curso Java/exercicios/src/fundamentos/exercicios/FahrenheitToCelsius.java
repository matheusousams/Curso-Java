package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite os grau em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double celsius = (fahrenheit - 32) * (5/9);

        System.out.println(fahrenheit + " F\" é igual a " + celsius + " C\"");

        entrada.close();
    }
}