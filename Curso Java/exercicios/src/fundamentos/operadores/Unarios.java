package fundamentos.operadores;

public class Unarios {
    
    public static void main(String[] args) {
    
        int a = 1;
        int b = 2;

        //pós fixada
        a++; // a = a+1;
        a--; // a = a-1;

        //pré-fixada
        ++b; // b = b+1;
        --b; // b = b-1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(++a == b--); //Incrementa o 'a' e soma com o 'b' antes dele ser decrementado
        System.out.println(a == b); //Compara com o "b" decrementado
        System.out.println(a);
        System.out.println(b);

    }

}
