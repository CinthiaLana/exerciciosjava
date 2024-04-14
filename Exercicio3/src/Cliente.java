public class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("Cinthia Lana"),
                new Cliente("Claudio Yakami"),
                new Cliente("Samuel Dias")
        };

        System.out.println(">>>>> Listagem de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
