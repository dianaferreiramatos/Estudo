package E.comparable.test;

import E.comparable.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto prod1 = new Produto("123", "Laptop Lenovo", 2000d);
        Produto prod2 = new Produto("112", "Picanha", 26.4);
        Produto prod3 = new Produto("456", "Teclado Razer", 1000d);
        Produto prod4 = new Produto("654", "ASamsung galaxy S7 64gb", 3250.5);

        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);
        produtos.add(prod4);

        //Java nao sabe q regra seguir para ordenar obj do tipo produto, a classe terá de implementar a interface Comparable
        Collections.sort(produtos);

        for(Produto prod : produtos){
            System.out.println(prod);
        }
    }
}
