package classe;

public class ValorNulo {
    
    public static void main(String[] args) {
        
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        Data data1 = Math.random() > 0.5 ? new Data() : null;

        if(data1 != null) {
            data1.mes = 3;
            System.out.println(data1.obterDataFormatada());
        }

        String s2 = Math.random() > 0.5 ? "Opa" : null;

        if(s2 != null) {
            System.out.println(s2.concat("???"));
        }
    }
}
