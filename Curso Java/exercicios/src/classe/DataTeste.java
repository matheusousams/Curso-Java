package classe;

public class DataTeste {
    
    public static void main(String[] args) {
        
        Data data1 = new Data();
        /*data.dia = 6;
        data.mes = 7;
        data.ano = 1998;
        */
        System.out.println("A data é: " + data1.obterDataFormatada() + ".");

        Data data2 = new Data(19, 2, 2022);
        System.out.println("A data é: " + data2.obterDataFormatada() + ".");
        
    }
}
