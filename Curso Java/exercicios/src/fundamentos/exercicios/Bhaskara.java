package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os valores de 'a', 'b' e 'c': ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double delta = (Math.pow(b, 2)) - 4*a*c;

        System.out.println("O delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / 2*a;
        double x2 = (-b - Math.sqrt(delta)) / 2*a;

        System.out.println("x1 é: " + x1);
        System.out.println("x2 é: " + x2);

        entrada.close();
    }
}
