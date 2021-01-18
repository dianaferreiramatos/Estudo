package E.comparable.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String serialNumber;
    private String nome;
    private Double preco;

    public Produto(String serialNumber, String nome, Double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(serialNumber, produto.serialNumber) &&
                Objects.equals(nome, produto.nome) &&
                Objects.equals(preco, produto.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, nome, preco);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber=" + serialNumber +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Produto o) {
        //retorna um int
        //num negativo se this.Obj < outroObj
        //zero se this.Obj == outroObj
        //num positivo se this.Obj > outroObj

        //aqui estou a delegar a responsabilidade para a classse String q ja implementa este metodo
        //return this.serialNumber.compareTo(o.getSerialNumber());
        return this.preco.compareTo(o.getPreco());
       // return this.serialNumber.compareTo(o.getSerialNumber());
    }
}
