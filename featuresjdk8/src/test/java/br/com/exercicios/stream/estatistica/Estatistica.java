package br.com.exercicios.stream.estatistica;

import br.com.exercicios.commons.PessoaUtils;
import br.com.exercicios.model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Estatistica {

    @Test
    @DisplayName("Obter a média de idade de todas as Pessoas")
    public void obterAMediaDeIdadeDasPessoas() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        IntSummaryStatistics intSummStat  = pessoas.stream()
                .mapToInt(p -> p.getIdade()).summaryStatistics();
        Assertions.assertEquals(42.76, intSummStat.getAverage());
    }

    @Test
    @DisplayName("Obter a média de idade de todas as Pessoas que o nome se inicia com a letra Z")
    public void obterAMediaDeIdadeDasPessoasQueIniciamoNomeComALetraZ() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        IntSummaryStatistics intSummStat  = pessoas.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("Z"))
                .mapToInt(p -> p.getIdade()).summaryStatistics();
        Assertions.assertEquals(33.00, intSummStat.getAverage());
    }
}