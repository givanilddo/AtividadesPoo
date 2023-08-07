package br.ufpb.dcx.AmigoSecreto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaAmigo {

    public static void main(String[] args) {
        List<Amigo> lista = new LinkedList<>();
        lista.add(new Amigo("gil","gil@gmail.com"));
        lista.add(new Amigo("jao","jao@gmail.com"));
        lista.add(new Amigo("paul","paul@gmail.com"));
        lista.add(new Amigo("finn","finn@gmail.com"));
        lista.add(new Amigo("bob","bob@gmail.com"));

        for(Amigo a: lista){
            System.out.println("Nome:"+a.getNome());
        }

        System.out.println("Lista ORDENADA: ");
        Collections.sort(lista);
        for (Amigo a: lista){
            System.out.println("Nome: "+a.getNome());
        }
    }
}
