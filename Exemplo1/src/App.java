import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("novo");
        diretorio.mkdir();

        File subdir1 = new File(diretorio, "subdir1");
        subdir1.mkdir();

        File subdir2 = new File(diretorio, "subdir2");
        subdir2.mkdir();

        File arquivo = new File(diretorio, "arquivoVazio.txt");
        FileWriter f = new FileWriter(arquivo);
        f.close();

        String[] arquivos = diretorio.list();
        for (String nome : arquivos) {
            File filho = new File(diretorio, nome);
            System.out.println(filho.getAbsolutePath());
        }
    }
}
