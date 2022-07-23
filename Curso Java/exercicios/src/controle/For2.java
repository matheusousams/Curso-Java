package controle;

public class For2 {

    public static void main(String[] args) {

        for(int x=10; x>=0; x--){
            if(x%2==0){
            System.out.println(x);
            }
        }
        //ou
        for(int x=10; x>=0; x-=2){
            System.out.println(x);
        }
    }    
}