package classe;

public class DataTeste {
    
    public static void main(String[] args) {
        
        Data data1 = new Data();
        data1.ano = 2022;

        var data2 = new Data(19,02,2022);

        String dataFormatada1 = data1.obterDataFormatada();

        System.out.println("A data é: " + dataFormatada1 + ".");
        System.out.println("A data é: " + data2.obterDataFormatada() + ".");

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
        
    }
}
