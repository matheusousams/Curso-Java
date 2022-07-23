package fundamentos.operadores;

public class Ternario {
    
    public static void main(String[] args) {
        
        double media = 7.6;
        String resultadoFinal = media >= 7.0 ?
        "Aprovado" : "Em recuperação";

        System.out.println(resultadoFinal);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota>=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "não";

        System.out.println("Tem desconto? " + resultado);

    }
}
