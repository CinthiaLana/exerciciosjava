import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    String nome;
    int anoNascimento;

    public Cliente(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return Period.between(LocalDate.of(anoNascimento, 1, 1), LocalDate.now()).getYears();
    }

    public String getClassificacaoEtaria() {
        int idade = getIdade();

        if (idade <= 17) {
            return "ADOLESCENTE";
        } else if (idade >= 18 && idade <= 29) {
            return "JOVEM";
        } else if (idade >= 30 && idade <= 59) {
            return "ADULTO";
        } else {
            return "IDOSO";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + anoNascimento + "\nIdade: " + getIdade() + "\nClassificação Etária: " + getClassificacaoEtaria();
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("Tamiris", 2005),
                new Cliente("Cibele", 1995),
                new Cliente("Cinthia", 1980),
                new Cliente("Marcos", 1950)
        };

        System.out.println(">>>>> Listagem de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println();
        }
    }
}
