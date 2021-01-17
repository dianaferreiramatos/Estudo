package B.enumerados.classes;

public class Cliente {
    //enumeraçao dentro da classe
    public enum TipoPagamento {
        AVISTA, APRAZO
    }


    private String nome;
    //private int tipo;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /*@Override
    public String toString() {
        //variavel local prevalece sobre a variavel de classe, aqui this.tipo e tipo sao coisas diferentes
        String tipo;
        if(this.tipo == 1)
        {
            tipo = "Pessoa Física";
        }
        else{
            tipo = "Pessoa Juridica";
        }
        return "Nome: " + this.nome + " tipo de cliente: " + tipo;
    }*/

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                ", numero=" + tipoCliente.getTipo() +
                ", tipoCliente=" + tipoCliente.getNome() +
                '}';
    }
}
