package fundamentos.exercicios;

import java.util.Scanner;

public class PesoAltura {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();

        double imc = peso/Math.pow(altura,2);

        System.out.println("Seu imc é: " + imc);

        entrada.close();
    }
}
