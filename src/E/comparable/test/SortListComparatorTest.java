package E.comparable.test;

import E.comparable.classes.Produto;
import E.comparable.classes.ProdutoNomeComparator;

import java.util.*;

public class SortListComparatorTest {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray = new Produto[4];
        Produto prod1 = new Produto("123", "Laptop Lenovo", 2000d);
        Produto prod2 = new Produto("112", "Picanha", 26.4);
        Produto prod3 = new Produto("456", "Teclado Razer", 1000d);
        Produto prod4 = new Produto("654", "ASamsung galaxy S7 64gb", 3250.5);

        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);
        produtos.add(prod4);
        produtosArray[0] = prod1;
        produtosArray[1] = prod2;
        produtosArray[2] = prod3;
        produtosArray[3] = prod4;

        Collections.sort(produtos, new ProdutoNomeComparator());

       // for (Produto prod : produtos) {
        //    System.out.println(prod);
        //}

        //mostra apenas o end de referncia do array:
        //System.out.println(produtosArray);

        //System.out.println(Arrays.toString(produtosArray));

        //ordena por preco
        /*Arrays.sort(produtosArray);
        for (Produto produto: produtosArray
             ) {
            System.out.println(produto);
            
        }*/

        //ordena pelo comparator (nome)
        Arrays.sort((produtosArray), new ProdutoNomeComparator());
        for (Produto produto: produtosArray
        ) {
            System.out.println(produto);

        }
    }
}
