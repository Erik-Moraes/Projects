import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;


class FilteringPeolpe extends PessoaMock {


/**
 * Crie um Predicate que verifica se uma pessoa tem mais de 25 anos
 * E ganha mais de 3000.
 */

@Test
    public void filtrarPessoasExperientesEBemPagas() {
    Predicate<Pessoa> criterio = pessoa ->
            pessoa.getIdade() > 25 && pessoa.getSalario() > 3000;

    long count = pessoas.stream()
            .filter(criterio)
            .count();

    assertThat(count).isEqualTo(3); // Bruno, Diana, Eduardo

}

    /**
     * Crie uma Function que retorna uma descrição formatada da pessoa.
     * Formato: "Nome tem X anos e ganha R$ Y"
     */

    @Test
    public void criarDescricaoPessoa() {
        Function<Pessoa, String> descrever = pessoa ->
        pessoa.getNome() + " tem " + pessoa.getIdade() + " anos e ganha R$ " + pessoa.getSalario();


        assertThat(descrever.apply(new Pessoa("João", 30, 5000.0)))
                .isEqualTo("João tem 30 anos e ganha R$ 5000.0");
    }

    /**
     * Combine dois Predicates usando AND e OR.
     */
    @Test
    public void combinarPredicates() {
        // TODO: Crie dois predicates e combine-os
        Predicate<Pessoa> maiorDe25 = p -> p.getIdade() >= 25;
        Predicate<Pessoa> salarioAlto = p -> p.getSalario() >= 4000; // > 4000

        //Com AND
        Predicate<Pessoa> criterioRigoroso = maiorDe25.and(salarioAlto) ;
        //Com OR
        Predicate<Pessoa> criterioFlexivel = maiorDe25.or(salarioAlto);

        long countRigoroso = pessoas.stream().filter(criterioRigoroso).count();
        long countFlexivel = pessoas.stream().filter(criterioFlexivel).count();

        assertThat(countRigoroso).isEqualTo(2); // Bruno e Diana
        assertThat(countFlexivel).isEqualTo(4); // Todos exceto Carlos

    }


}