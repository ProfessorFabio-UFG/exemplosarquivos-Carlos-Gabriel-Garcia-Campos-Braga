import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class App {
    public static void main(String[] args) throws IOException {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);

        if (result == JFileChooser.CANCEL_OPTION) {
            System.exit(0);
        } else {
            File arquivo = fc.getSelectedFile();
            try {
                BufferedReader in = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = in.readLine()) != null) {
                    System.out.println(linha);
                }
                in.close();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
