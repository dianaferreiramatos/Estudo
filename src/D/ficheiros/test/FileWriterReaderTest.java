package D.ficheiros.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        //FileWriter vai escrever no ficheiro
        //por usarmos o FileWriter ele ja vai criar o ficheiro e nao so o objeto

        //try with resources
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Mensagem no ficheiro \n e salta uma linha! 3 \n");
            //tudo o que estiver em buffer vai para o ficheiro
            fw.flush();
            FileReader fr = new FileReader(file);
            char[] in = new char[500];
            //retorna um int e vai colocar dentro de um array
            //e o numero de caraceres lidos
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            //ficheiro + append permite acrescentar info no ficheiro em vez de a reescrever
            FileWriter fw = new FileWriter(file, true);
            fw.write("Mensagem no ficheiro \n e salta uma linha! 3 \n");
            //tudo o que estiver em buffer vai para o ficheiro
            fw.flush();
            //fecha o ficheiro
            fw.close();

            FileReader fr = new FileReader(file);
            char[] in = new char[500];
            //retorna um int e vai colocar dentro de um array
            //e o numero de caraceres lidos
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            for (char c : in){
                System.out.print(c);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
