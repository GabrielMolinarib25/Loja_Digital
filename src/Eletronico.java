public class Eletronico extends Produto {

private String tipo;

private String marca;



    public Eletronico(String nome, double preco, int estoque, String tipo, String marca) {
    super(nome, preco, estoque);
    this.tipo = tipo;
    this.marca = marca;
    aplicarDesconto(0.10);
}

    public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

    @Override
    void aplicarDesconto(double percentual) {
        double novoPreco= getPreco() - (getPreco() * percentual);
        setPreco(novoPreco);
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Eletrônico: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Estoque: " + getEstoque() + " unidades");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
    
}
