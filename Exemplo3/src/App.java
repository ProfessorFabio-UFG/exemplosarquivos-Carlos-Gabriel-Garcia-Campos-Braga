import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.print("Digite o texto: ");
        FileOutputStream f0 = new FileOutputStream("saida.txt");
        byte a = (byte) System.in.read();

        while (a != '\n') {
            f0.write(a);
            a = (byte) System.in.read();
        }

        f0.close();
    }
}
