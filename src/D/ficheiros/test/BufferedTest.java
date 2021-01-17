package D.ficheiros.test;

import java.io.*;
import java.nio.Buffer;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        //try with resources
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))){

            bf.write("Mensagem no ficheiro");
            bf.newLine();
            bf.write("E salta uma linha");
            bf.flush();

            FileReader fr = new FileReader(file);
            String s;
            //readLine() devolve uma String
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }

        }catch (IOException e){
                e.printStackTrace();
        }

        /*try {
            //ficheiro + append permite acrescentar info no ficheiro em vez de a reescrever
            FileWriter fw = new FileWriter(file, true);

            //em x de usar o fw vamos usar o bf
            BufferedWriter bf = new BufferedWriter(fw);


            bf.write("Mensagem no ficheiro");
            bf.newLine();
            bf.write("E salta uma linha");
            bf.flush();
            bf.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            //readLine() devolve uma String
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
            //fechando o mais externo, ele automaticamente fecha os mais internos (fr.close())
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
