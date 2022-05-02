package br.com.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorIdade {

    public void ordenarPorIdade(){

        System.out.println("Ordenando pessoas pela idade:");
        List<Pessoa> listPessoas = ListaPessoas.getListPessoas();
        Collections.sort(listPessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2){
                return pessoa1.getIdade().compareTo(pessoa2.getIdade());
            }
        });
        listPessoas.forEach(p -> System.out.println(p.getNome()));
    }

}
