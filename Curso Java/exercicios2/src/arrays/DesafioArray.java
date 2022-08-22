package arrays;

import java.util.Scanner;

public class DesafioArray {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de notas:\n");

        int n = scanner.nextInt();

        double[] notas = new double[n];

        for (int index = 0; index < notas.length; index++) {
            System.out.println("\nDigite a nota " + (index+1) + ":");
            notas[index] = scanner.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total+=nota;
        }
        
        System.out.println("A média é: " + total/notas.length);
        
        scanner.close();
    }
}
