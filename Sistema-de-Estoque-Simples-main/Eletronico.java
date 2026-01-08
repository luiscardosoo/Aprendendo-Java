public class Eletronico extends Produto{
    String marca;

    public Eletronico(int id, String nome, double preco, String marca) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ELETRONICO   id: " + id + "  nome: " + nome + "  preco: " + preco + "  marca: " + marca);
    }
}
