package controle;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String frase = "";

        do{
            System.out.println("Quer sair?");
            frase = entrada.nextLine();
        } while(!frase.equalsIgnoreCase("sim"));

        System.out.println("Fim!");

        entrada.close();
    }
}
