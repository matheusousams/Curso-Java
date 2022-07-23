package controle;

import java.util.Scanner;

public class DesafioWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int cont=0;
        while (nota != -1) {
            
            System.out.println("Digite a nota: ");

            nota = entrada.nextDouble();

            if (nota >=0 && nota <=10) {
                total+=nota;
                cont++;
            } else if(nota!=-1) {
                System.out.println("Nota inválida!!!\n" + "Digite novamente!");
            }
        }

        double media = total/cont;
        System.out.println("A média é: " + media);



        entrada.close();
    }
}
