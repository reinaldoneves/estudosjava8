package br.com.core;

import java.util.Arrays;
import java.util.List;

public class ListaPessoas {

    public static List<Pessoa> getListPessoas() {
        List<Pessoa> listPessoas = Arrays.asList(new Pessoa("Eduardo", 29),
        new Pessoa("Luiz", 32), new Pessoa("Bruna", 26));
        return listPessoas;
    }

}
