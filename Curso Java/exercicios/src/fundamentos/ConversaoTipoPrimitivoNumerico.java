package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    
    public static void main(String[] args) {
        
        double a = 1; //implícita
        System.out.println(a);

        float b1 = 1.0F; //explícita
        System.out.println(b1);
        //ou
        float b2 = (float) 1.0; //explícita
        System.out.println(b2);

        int c = 4;
        byte d = (byte) c; //explícita
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}
