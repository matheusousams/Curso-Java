package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double numero = entrada.nextDouble();

        if(numero<=10 && numero>=0){
            if(numero%2==0){
                System.out.println("O número " + numero + " está entre 0 e 10 e é par!");
            }else{
                System.out.println("O número " + numero + " está entre 0 e 10 e é ímpar!");
            }  
        }else{
            if(numero%2==0){
                System.out.println("O número " + numero + " não está entre 0 e 10 e é par!");
            }else{
                System.out.println("O número " + numero + " não está entre 0 e 10 e é ímpar!");
            }         }

        entrada.close();
    }    
}