public class Livro extends Produto{

    String autor;

    public Livro(int id, String nome, double preco, String autor){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("LIVRO    id: " + id + "  nome: " + nome + "  preco: " + preco + "  autor: " + autor);
    }
}
