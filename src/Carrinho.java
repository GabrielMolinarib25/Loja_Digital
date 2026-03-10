
import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println("-------------------");
        }
    }

    public void calcularTotal(){
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        if (produtos.size() > 5) {
            total -= total * 0.05; // Aplica desconto de 5% para mais de 5 produtos 
        }
        System.out.println("Total do carrinho: R$ " + total);
    }


}
