package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(1);		
		System.out.println(a.area());
		
		//Usando o método static
		System.out.println(AreaCirc.area(1));
		
	}
}
