package classe;

public class ProdutoTeste {

    public static void main(String[] args) {   
        Produto p1 = new Produto("Notebook", 4356.89);
        //p1.nome = "Notebook";
        //p1.preco = 4356.89;
        //p1.desconto = 0.25;

        Produto p2 = new Produto("Caneta Preta", 12.56);
        //p2.nome = "Caneta Preta";
        //p2.preco = 12.56;
        Produto.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double mediaCarrinho = (p1.precoComDesconto() + p2.precoComDesconto())/2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
