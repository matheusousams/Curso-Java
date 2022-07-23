package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    
    public static void main(String[] args) {
        
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2".equals(s));

        Scanner teclado = new Scanner(System.in);

        String s2 = teclado.nextLine();
        System.out.println("2" == s2.trim()); //trim() tira os espaços em nextLine() [Não precisa em next()]
        System.out.println("2".equals(s2.trim()));


        teclado.close();
    }
}
