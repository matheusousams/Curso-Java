package classe;

public class Data {
    
    int dia;
    int mes;
    int ano;

    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
    }

    Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, this.mes, this.ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }
}
