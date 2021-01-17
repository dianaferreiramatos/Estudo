package D.ficheiros.test;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.Date;

//principais metodos da classe File
public class FileTest {
    public static void main (String[] args) {
        //Estou apenas a criar o objeto do tipo Ficheiro, nao estou a criar o ficheiro em si
        //File file = new File("Arquivo.text");
        File file = new File("Arquivo.text");
        try {
            boolean newFile= file.createNewFile();
            System.out.println(newFile);
            //pode ser tbM: System.out.println(file.createNewFile());

            System.out.println("Tem permissao de leitura?" + file.canRead());
            System.out.println("Path(Abs. Path): " + file.getAbsolutePath());
            System.out.println("Path: " + file.getPath());
            System.out.println("Diretorio? " + file.isDirectory());
            System.out.println("Oculto? " + file.isHidden());
            //file.lastModified() retorna um tempo em ms, temos de converter:
            System.out.println("Modificado pela ultima x? " +  new Date(file.lastModified()));

            if(file.exists()) {
                System.out.println("Apagou?" + file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
