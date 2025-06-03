import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("listaAlunos.txt");
        FileInputStream in = new FileInputStream(arquivo);
        InputStreamReader conversor = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(conversor);

        String linha;
        while ((linha = bf.readLine()) != null) {
            System.out.println(linha);
        }

        bf.close();
        in.close();
    }
}
