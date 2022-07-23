package fundamentos;

public class Temperatura {
    
    public static void main(String[] args) {
        
        final double fator=5/9.0;
        final double ajuste=32;

        //Temperatura em Fº
        double F = 86;
        //Temperatura em Cº
        double C = (F-ajuste)*fator;
        
        System.out.println(F + " Fº são " + C + " Cº");
        
    }
}
