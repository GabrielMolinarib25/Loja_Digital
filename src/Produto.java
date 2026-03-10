public abstract class Produto {
    
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        if (preco < 0.0){
            this.preco = 0.0;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
        if (estoque < 0) {
            this.estoque = 0; // Evita estoque negativo
        }
    }

    abstract void aplicarDesconto(double percentual);
    abstract void exibirDetalhes();

    
}
