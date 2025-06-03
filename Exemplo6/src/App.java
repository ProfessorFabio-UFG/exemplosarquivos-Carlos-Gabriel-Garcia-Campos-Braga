import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws IOException {
        FileReader inputFile = new FileReader("oi.txt");
        FileWriter outputFile = new FileWriter("ola.txt");

        BufferedReader in = new BufferedReader(inputFile);
        PrintWriter out = new PrintWriter(outputFile);

        String s;
        while ((s = in.readLine()) != null) {
            out.println(s);
            out.flush();
        }

        in.close();
        out.close();
    }
}
