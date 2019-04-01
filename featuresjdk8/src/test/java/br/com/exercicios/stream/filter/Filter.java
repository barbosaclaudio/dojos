package br.com.exercicios.stream.filter;

import br.com.exercicios.commons.PessoaUtils;
import br.com.exercicios.model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Filter {

    @Test
    public void filtrarPessoasQueIniciamComLetraA() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        List<Pessoa> pessoasComLetraA = pessoas.stream().filter(pessoasQueIniciamComLetra("A")).collect(Collectors.toList());
        Assertions.assertEquals(4,pessoasComLetraA.size());
    }

    @Test
    public void filtrarPessoasQueIniciamNasceramEntre1960e1980() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        List<Pessoa> pessoasComLetraA = pessoas.stream()
                .filter(p -> p.getDataNascimento().isBefore(LocalDate.of(1980,12,31)))
                .filter(p -> p.getDataNascimento().isAfter(LocalDate.of(1960,1,1)))
                .collect(Collectors.toList());
        Assertions.assertEquals(20,pessoasComLetraA.size());
    }

    @Test
    public void dadoUmEspecificoNomeFiltrarSeAPessoaEhCltParceiroSubloginOuPJ() { //respeite a ordem, se encontrar você deve parar o método.
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        List<Pessoa> pessoasComLetraA = pessoas.stream()
                .filter(p -> p.getDataNascimento().isBefore(LocalDate.of(1980,12,31)))
                .filter(p -> p.getDataNascimento().isAfter(LocalDate.of(1960,1,1)))
                .collect(Collectors.toList());
        Assertions.assertEquals(20,pessoasComLetraA.size());
    }

    @Test
    public void filtrarPessoasQueIniciamComLetraMeTipoCLT() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        List<Pessoa> pessoasComLetraA = pessoas.stream()
                .filter(pessoasQueIniciamComLetra("M").and(pessoasClt()))
                .collect(Collectors.toList());
        Assertions.assertEquals(3, pessoasComLetraA.size());
    }

    private Predicate<Pessoa> pessoasClt() {
        return pessoa -> pessoa.getTipo().equals("CLT");
    }

    private Predicate<Pessoa> pessoasQueIniciamComLetra(String letra) {
        return p -> p.getNome().startsWith(letra);
    }

}
