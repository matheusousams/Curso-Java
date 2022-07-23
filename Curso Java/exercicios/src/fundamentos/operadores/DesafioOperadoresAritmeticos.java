package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        //Componentes do numerador da primeira fração
        double a = 6;
        double b = 3+2;
        //Numerador da primeira fração
        double ab = Math.pow(a*b,2);
        //Denominador da primeira fração
        double c = 3*2;

        //Componentes do numerador da segunda fração
        double d = 1-5;
        double e = 2-7;
        //Numerador da segunda fração
        double de = d*e;
        //Denominador da segunda fração
        double f= 2;

        //Primeira fração
        double fracao1 = ab/c;
        //Segunda fração
        double fracao2 = Math.pow(de/f, 2);

        //Numerador da fração total
        double numerador = Math.pow(fracao1 - fracao2, 3);
        //Denominador da fração total
        double denominador = Math.pow(10,3);

        //Fração Total
        double fracao = numerador/denominador;
        
        System.out.println((int) fracao); //CAST
        
    }

}