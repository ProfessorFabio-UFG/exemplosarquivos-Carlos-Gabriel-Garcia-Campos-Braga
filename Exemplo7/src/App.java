import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("arquivo.txt");
        PrintWriter pw = new PrintWriter(fw);

        String linha = JOptionPane.showInputDialog("linha:");
        while (!linha.equals("fim")) {
            pw.println(linha);
            pw.flush();
            linha = JOptionPane.showInputDialog("linha:");
        }

        pw.close();
    }
}
