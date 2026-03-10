public class Alimento extends Produto {

    private String validade;
    private String marca;

    public Alimento(String nome, double preco, int estoque, String validade, String marca) {
        super(nome, preco, estoque);
        this.validade = validade;
        this.marca = marca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
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
        System.out.println("Alimento: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Estoque: " + getEstoque() + " unidades");
        System.out.println("Marca: " + marca);
        System.out.println("Validade: " + validade);
    }
    
}
