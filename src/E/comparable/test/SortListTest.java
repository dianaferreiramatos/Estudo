package E.comparable.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Suane");
        nomes.add("Diana");
        nomes.add("Brenon");
        nomes.add("Bruno");
        nomes.add(0, "Ana");
        //se fizer sout, mantem ordem baseada no indice

        //Classe utilitaria Collections e metodo sort()
        //Vai ordenar pela ordem q a String deve ser ordenada, ordem alfabetica
        //class String implementa Comparable()
        Collections.sort(nomes);


        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.2);
        numeros.add(1.6);
        numeros.add(2d);
        for(String nome : nomes){
            System.out.println(nome);
        }

        Collections.sort(numeros);
        //ordena por valor (Double implementa Comparable)
        for(Double num : numeros){
            System.out.println(num);
        }


    }
}
