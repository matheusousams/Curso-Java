package fundamentos;

import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {
        
        //O print sem o ln e o printf não criam uma nova linha
        System.out.print("Bom");
        System.out.print(" dia!");
        
        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Quina: %d %d %d %d %d %n", 
                            1, 2, 3, 4, 5);
        System.out.printf("Salario: %.2f %n", 45326.678);
        System.out.printf("Nome: %s\n", "Matheus");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Nome: " + nome + "\nIdade: " + idade);

        entrada.close();
    }
}
