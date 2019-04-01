package br.com.exercicios.stream.map;

import br.com.exercicios.commons.PessoaUtils;
import br.com.exercicios.model.Cliente;
import br.com.exercicios.model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    @Test
    public void contruirClientesAPartirDaBaseDePessoasComIdadeMaiorQue40Anos() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        List<Cliente> clientes = pessoas.stream()
                .filter(pessoa -> pessoa.getDataNascimento().isBefore(LocalDate.now().minusYears(40)))
                .map(p -> new Cliente(p.getNome(), ChronoUnit.YEARS.between(p.getDataNascimento(), LocalDate.now())))
                .collect(Collectors.toList());

        Assertions.assertEquals(51, clientes.size());
    }

    @Test
    public void obterASomaDeIdadeDeTodasAsPessoas() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        long idade = pessoas.stream()
                .mapToLong(pessoa -> ChronoUnit.YEARS.between(pessoa.getDataNascimento(), LocalDate.now())).sum();
        Assertions.assertEquals(4276 , idade);
    }



}
