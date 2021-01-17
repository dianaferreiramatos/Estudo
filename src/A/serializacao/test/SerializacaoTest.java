package A.serializacao.test;

import A.serializacao.classes.Aluno;
import A.serializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {

    public static void main (String[] args){
        gravadorObjecto();
        leitorObjecto();

    }

    //serializacao
    private static void gravadorObjecto(){
        //Criar objeto~
        Turma t = new Turma("maratona Java");
        Aluno aluno = new Aluno(1L, "Diana", "1234");
        aluno.setTurma(t);

        //Guardar o aluno no ficheiro. pra isso e necessario serializar o aluno
        /*try{
            FileOutputStream fos = new FileOutputStream("aluno.serializado");
            //guardar objetos (fos) num ficheiro
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aluno);
            oos.close();*/
        //OUTRA FORMA::
        //https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        // The try-with-resources statement is a try statement that declares one or more resources. A resource is an
        // object that must be closed after the program is finished with it. The try-with-resources statement ensures
        // that each resource is closed at the end of the statement. Any object that implements java.lang.AutoCloseable,
        // which includes all objects which implement java.io.Closeable, can be used as a resource.

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.serializado"));){
            oos.writeObject(aluno);

        } catch (IOException e){
            e.printStackTrace();
        }


    }

    //deserializacao
    private static void leitorObjecto(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.serializado"));){
            //este metodo retorna um objeto. como fomos nos q criamos, sabemos q retorna um Aluno, entao podemos fazer um cast para Aluno
            //ois.readObject();
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);


        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
