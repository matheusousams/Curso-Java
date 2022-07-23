package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        do {
            System.out.println("Sorteando número");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Jogo comecou, você tem 10 tentativas");
            tentativas = 0;

            do {

                tentativas++;
                
                System.out.println("Tentativa: " + tentativas);
                numero = entrada.nextInt();

                if(numero > numeroSorteado){
                    System.out.println("O numero sorteado é menor");
                }else if(numero < numeroSorteado){
                    System.out.println("O numero sorteado é maior");
                }else{
                    System.out.println("Acertou");
                }
                
                switch (tentativas) {
                    case 10:
                    System.out.println("Suas tentativas acabaram");
                        break;
                }

            } while ((numero != numeroSorteado) && (tentativas<10));
            
            System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar");
            continuar = entrada.nextInt();

        } while (continuar != 0);

        entrada.close();
    }
}
