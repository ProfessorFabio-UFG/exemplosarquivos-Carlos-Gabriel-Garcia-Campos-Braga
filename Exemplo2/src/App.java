import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("tmp");
        diretorio.mkdir();

        File arquivo = new File(diretorio, "lixo.txt");
        FileOutputStream out = new FileOutputStream(arquivo);
        out.write(new byte[] {'l', 'i', 'x', 'o'});

        File subdir = new File(diretorio, "subdir");
        subdir.mkdir();

        for (String nome : diretorio.list()) {
            File filho = new File(diretorio, nome);
            System.out.println(filho.getAbsolutePath());
        }

        if (arquivo.exists()) {
            arquivo.delete();
        }

        out.close();
    }
}
