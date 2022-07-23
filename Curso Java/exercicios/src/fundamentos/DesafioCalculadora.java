package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1 = teclado.nextDouble();
        String operador = teclado.next();
        double num2 = teclado.nextDouble();

        double resultado = "+".equals(operador) ? num1+num2 : 0;
        resultado = "-".equals(operador) ? num1-num2 : resultado;
        resultado = "*".equals(operador) ? num1*num2 : resultado;
        resultado = "/".equals(operador) ? num1/num2 : resultado;
        resultado = "%".equals(operador) ? num1%num2 : resultado;
        
        System.out.println(resultado);

        teclado.close();
    }
}
