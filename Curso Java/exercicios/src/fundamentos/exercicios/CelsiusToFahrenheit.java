package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite os grau em Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " C\" é igual a " + fahrenheit + " F\"");

        entrada.close();
    }
}
