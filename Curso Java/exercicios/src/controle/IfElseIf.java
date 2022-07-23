package controle;

import java.util.Scanner;

public class IfElseIf {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota: ");

        double nota = entrada.nextDouble();

        if(nota > 10.0 || nota < 0.0){
            System.out.println("Nota inválida!");
        }else if(nota>=7.0){
            System.out.println("Aprovado");
        }else if(nota<7.0 && nota>=4.0){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
