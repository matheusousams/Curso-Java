package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    int cont=0;

    System.out.println("Digite um número");

    int numero = entrada.nextInt();

    for(int i = 2; i < numero; i++){
        if(numero%i==0){
            cont++;
        }
    }

    if(cont==0){
        System.out.println("primo");
    }else{
        System.out.println("não primo");
    }

    entrada.close();
    }

}
