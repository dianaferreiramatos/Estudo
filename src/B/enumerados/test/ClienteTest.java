package B.enumerados.test;

import B.enumerados.classes.Cliente;
import B.enumerados.classes.TipoCliente;

public class ClienteTest {
    public static void main (String[] args){
        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);
    }
}
