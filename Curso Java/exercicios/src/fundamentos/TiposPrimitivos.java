package fundamentos;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        //Informações do funcionário

        //Tipos numéricos inteiros
        byte anoDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3134845223L;

        //Tipos numéricos reais;
        float salario = 11445.44F;
        double vendasAcumuladas = 2991797103.01;

        //Tipos booleano
        boolean estaDeFerias = false;

        //Tipo caractere
        char status ='A'; //ativo

        //Dias de Empresa
        System.out.println(anoDeEmpresa*365);

        //Número de Viagens
        System.out.println(numeroDeVoos/2);

        //Pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
