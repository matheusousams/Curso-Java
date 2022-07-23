package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite a base: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        double area = (base*altura)/2;

        System.out.println("A área do triângulo é: " + area);

        entrada.close();
    }
}
