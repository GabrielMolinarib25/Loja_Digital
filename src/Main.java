public class Main {

    public static void main(String[] args) {

    Carrinho carrinho = new Carrinho();

    Eletronico eletronico = new Eletronico("Galaxy A56",2000.0,10,"Smartphone", "Samsung");
    Roupa roupa = new Roupa("Camiseta Palmeiras",200.0,20,"G", "Verde", "Puma");
    Alimento alimento = new Alimento("Arroz", 20.0, 50,"2024-12-31","Camil");
    Eletronico eletronico2 = new Eletronico("Notebook Dell", 5000.0, 5,"Notebook", "Dell");
    Roupa roupa2 = new Roupa("Calça Moleton", 100.0, 10,"G", "Preto", "Nike");

    carrinho.adicionarProduto(eletronico);
    carrinho.adicionarProduto(roupa);
    carrinho.adicionarProduto(alimento);
    carrinho.adicionarProduto(eletronico2);
    carrinho.adicionarProduto(roupa2);
    carrinho.listarProdutos();
    carrinho.calcularTotal();

    }

}