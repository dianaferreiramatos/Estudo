package D.ficheiros.test;

import java.io.*;

//Stream é um fluxo de dados
//Buffer - em x de ler diretamente do disco lê da memoria
public class StreamsTest {
    public static void main(String[] args) {
        //gravador();
        //leitor();
        //gravadorTunado();
        leitorTunado();
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        //classe OutputStream implements Closeable por isso não precisamos de "fechar" o ficheiro pq ja faz isso por nos
        //classe FileOutputStream automaticamente cria o ficheiro por isso basta instancia-la
        //com append==true ele acrescenta no ficheiro, nao reescreve
        try (FileOutputStream gravador = new FileOutputStream("src/stream.txt", true)) {
            //escrever os bytes no ficheiro
            //for (Byte b : dados) {
            //    gravador.write(b);

            gravador.write(dados);
            gravador.flush();
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void gravadorTunado() {

        byte[] dados = {65, 66, 67, 68, 69, 70};
        //classe OutputStream implements Closeable por isso não precisamos de "fechar" o ficheiro pq ja faz isso por nos
        //classe FileOutputStream automaticamente cria o ficheiro por isso basta instancia-la
        //com append==true ele acrescenta no ficheiro, nao reescreve
        try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream(
                    "src/stream.txt"), 4098)){
            gravadorBuffer.write(dados);
            //"cospe" tudo o que tiver antes de fechar
            gravadorBuffer.flush();
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitor() {
        try (FileInputStream leitor = new FileInputStream("src/stream.txt")) {
            //qd chegar ao final do ficheiro ele vai retornar -1
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                //vamos converter o int para byte fazendo um cast
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorTunado() {
        try (BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("src/stream.txt"))){
            int leitura;
            while ((leitura = leitorBuffer.read()) != -1) {
                //vamos converter o int para byte fazendo um cast
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

