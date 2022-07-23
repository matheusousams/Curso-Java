package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1 = teclado.next().replace(",", ".");
        System.out.print("Digite o segundo salário: ");
        String salario2 = teclado.next().replace(",", ".");
        System.out.print("Digite o terceiro salário: ");
        String salario3 = teclado.next().replace(",", ".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);

        /*System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

        double media = (s1+s2+s3)/3.0;

        System.out.printf("Média: %.2f\n", media);

        teclado.close();
    }
}
