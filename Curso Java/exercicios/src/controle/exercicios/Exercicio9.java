package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        double maiorn = 0;

        do {
            double n = entrada.nextDouble();

            if (n>maiorn) {
                maiorn = n;
            }

            cont++;

        } while (cont!=10);

        System.out.println("O maior valor é: " + maiorn);

        entrada.close();
    }
}
