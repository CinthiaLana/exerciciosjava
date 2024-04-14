public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + "\nPreço: R$ " + preco;
    }

    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("Celular", 1500.00),
                new Produto("Caderno", 12.90),
                new Produto("Livro", 70.00),
                new Produto("Lapis", 5.00)
        };

        System.out.println(">>>>> Listagem de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
            System.out.println();
        }
    }
}
