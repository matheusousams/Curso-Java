package fundamentos;

public class TipoString {
    
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Matheus";
        var sobrenome = "Sousa";
        var idade = 23;
        var salario = 10000.567;

        System.out.println("Nome: " + nome 
                            + "\nSobrenome: " + sobrenome);

        System.out.printf("O senhor %s %s tem %d anos e ganha $%.2f.", 
                            nome,sobrenome,idade,salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha $%.2f.", 
                                        nome,sobrenome,idade,salario);

        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6,8));

    }
}
