package fundamentos.operadores;

public class Aritmeticos {
    
    public static void main(String[] args) {
        
        var x = 7;
        var y = 3;

        var soma = x + y;
        var subtracao1 = x-y;
        var subtracao2 = y-x;
        var multiplicacao = x*y;
        var divisao1 = x/(double)y; //CAST
        var divisao2 = y/(double)x; //CAST

        System.out.println(soma);
        System.out.println(subtracao1);
        System.out.println(subtracao2);
        System.out.println(multiplicacao);
        System.out.println(divisao1);
        System.out.println(divisao2);

        var resto = x%y;
        System.out.println(resto);

    }
}
