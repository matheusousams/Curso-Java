package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    
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
    
        switch (cont) {
            case 0:
                System.out.println("primo");
                break;
            default:
                System.out.println("não é primo");
                break;
        }
    
        entrada.close();
    }
}
