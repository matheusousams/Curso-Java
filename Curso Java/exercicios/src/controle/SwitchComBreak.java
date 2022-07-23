package controle;

import java.util.Scanner;

public class SwitchComBreak {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        int nota = entrada.nextInt();

        switch(nota){
            case 10:
            conceito="Aprovado";
            break;
            case 9:
            conceito="Aprovado";
            break;
            case 8:
            conceito="Aprovado";
            break;
            case 7:
            conceito="Aprovado";
            break;
            case 6:
            conceito="Recuperação";
            break;
            case 5:
            conceito="Recuperação";
            break;
            case 4:
            conceito="Recuperação";
            break;
            case 3:
            conceito="Reprovado";
            break;
            case 2:
            conceito="Reprovado";
            break;
            case 1:
            conceito="Reprovado";
            break;
            case 0:
            conceito="Reprovado";
            break;
            default:
            conceito="Nota inválida";
        }
        System.out.println(conceito);

        entrada.close();
    }
}
