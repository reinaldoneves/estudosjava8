package br.com.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorNome {

    public void ordenarPorNome() {
    System.out.println("Ordenando pessoas pelo nome:");

    List<Pessoa> listPessoas = ListaPessoas.getListPessoas();
    Collections.sort(listPessoas, new Comparator<Pessoa>()  {
        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2){
            return pessoa1.getNome().compareTo(pessoa2.getNome());
        }
    });
    listPessoas.forEach(p -> System.out.println(p.getNome()));

    }
}
