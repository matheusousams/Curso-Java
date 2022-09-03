package classe;

import java.util.Date;

public class Equals {
    
    public static void main(String[] args) {
        
        Usuario user1 = new Usuario();
        user1.nome = "Fulano de Tal";
        user1.email = "xxxx.xxxx@gmail.com";

        Usuario user2 = new Usuario();
        user2.nome = "Fulano de Tal";
        user2.email = "xxxx.xxxx@gmail.com";

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

        System.out.println(user1.equals(new Date()));
    }
}
