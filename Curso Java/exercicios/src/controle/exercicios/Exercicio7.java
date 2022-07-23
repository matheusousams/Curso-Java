package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double n = 0;
        double soma = 0;

        do {

            n = entrada.nextDouble();

            if(n>=0) {

                soma+=n;
                System.out.println(soma);

            }

        } while (n>=0);

        entrada.close();
    }
}
