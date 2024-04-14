public class Cliente {
    String nome;
    int anoNascimento;

    public Cliente(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Ano de Nascimento: " + anoNascimento;
    }

    public static void main(String[] args) {
        Cliente anoNacimento;
        Cliente[] clientes = {
                new Cliente("Fulano", 1982),
                new Cliente("Ciclano", 1997),
                new Cliente("Bertano", 2000),
        

        };

        System.out.println(">>>>> Listagem de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

