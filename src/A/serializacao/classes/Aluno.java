package A.serializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

//classe tem de implementar Serializable caso contrario nao pode ser serializavel
//classe Serializable é uma classe "Flag", apenas para indicar que os objetos desta classe serao serializaveis
public class Aluno implements Serializable {
    private long id;
    private String nome;
    //para que o Java "ignore" um atributo e nao o serialize, devemos dizer que é transiente
    private transient String password;

    private Turma turma;
    private static String nomeEscola = "DevDojo";


    public Aluno(long id, String nome, String password) {
        System.out.println("Dentro do construtor ");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String
    toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    //este metodo é chamado qd serializamos
    private void writeObject (ObjectOutputStream oos){
        try {
            //serializacao "normal"
            oos.defaultWriteObject();
            //serializacao pretendida (extra)
            oos.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            //leitura normal
            ois.defaultReadObject();
            //leitura da String depois do objeto. readUTF não sabe o que vai ler mas o java sabe q depois do objeto tem
            //um objeto para ler tal como definido acima
            turma = new Turma(ois.readUTF());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id == aluno.id &&
                Objects.equals(nome, aluno.nome) &&
                Objects.equals(password, aluno.password);
    }

}
