package br.com.exercicios.stream.mapping;

import br.com.exercicios.commons.PessoaUtils;
import br.com.exercicios.model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapping {


    @Test
    public void mapearPessoasPorTipo() {
        List<Pessoa> pessoas = PessoaUtils.obterPessoas();
        Map<String, List<Pessoa>> collect = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getTipo));
        Assertions.assertEquals(24, collect.get("NA").size());
        Assertions.assertEquals(27, collect.get("CLT").size());
        Assertions.assertEquals(25, collect.get("PJ").size());
        Assertions.assertEquals(24, collect.get("SUBLOGIN").size());
    }

}
