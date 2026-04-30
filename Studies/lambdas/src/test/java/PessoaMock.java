import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class PessoaMock {

    public class Pessoa {
        private String nome;
        private int idade;
        private double salario;

        public Pessoa(String nome, int idade, double salario) {
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }

        public String getNome() { return nome; }
        public int getIdade() { return idade; }
        public double getSalario() { return salario; }

        @Override
        public String toString() {
            return nome + " (" + idade + " anos)";
        }
    }

    public List<FilteringPeolpe.Pessoa> pessoas = List.of(
            new FilteringPeolpe.Pessoa("Ana", 25, 3000.0),
            new FilteringPeolpe.Pessoa("Bruno", 30, 4500.0),
            new FilteringPeolpe.Pessoa("Carlos", 22, 2500.0),
            new FilteringPeolpe.Pessoa("Diana", 35, 6000.0),
            new FilteringPeolpe.Pessoa("Eduardo", 28, 3800.0)
    );


}
