package fundamentos.operadores;

public class DesafioLogicos {
    
    public static void main(String[] args) {
        
        //Trabalhos
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        //TV 50'
        boolean TV50 = trabalho1&&trabalho2;
        System.out.println("TV de 50\": " + TV50);

        //TV 32'
        boolean TV32 = trabalho1^trabalho2;
        System.out.println("TV de 32\": " + TV32);

        //Sorvete
        boolean sorvete = trabalho1||trabalho2;
        System.out.println("Vao tomar sorvete: " + sorvete);

        //Saudável
        boolean saudavel = !sorvete;
        System.out.println("Vao ficar saudaveis: " + saudavel);
    }
}
