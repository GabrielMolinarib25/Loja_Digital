public class Roupa extends Produto {

    private String tamanho;
    private String cor;
    private String marca;

    public Roupa(String nome, double preco, int estoque, String tamanho, String cor, String marca) {
        super(nome, preco, estoque);
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        aplicarDesconto(0.20);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    void aplicarDesconto(double percentual) {
        double novoPreco = getPreco() - (getPreco() * percentual);
        setPreco(novoPreco);
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Roupa: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Estoque: " + getEstoque() + " unidades");
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
    
}
