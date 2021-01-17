package B.enumerados.classes;

public enum TipoCliente {
    //nas enumeracoes tudo é considerado constante
    //atributos serao constantes
    //PESSOA_FISICA(3, "Pessoa Física"), PESSOA_JURIDICA(4, "Pessoa Jurídica");

    //constant specific class body
    //estou a reescrever o metodo getId() apenas pera PESOA_JURIDICA, pouco usado
    PESSOA_FISICA(3, "Pessoa Física"), PESSOA_JURIDICA(4, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };



    //podemos criar atributos na enumeracao, nesta ordem
    private int tipo;
    private String nome;

    //construturo nao pode ser public, nao s epode chamar este contrutor, ele proprio se chama
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }



    public String getId(){
        return "A";
    }


    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
