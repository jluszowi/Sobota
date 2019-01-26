import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lab52 {



        public static void main(String[] args) throws IOException {

        List<String> lines =
                Files.readAllLines(Paths.get("src/Lab52.txt"));
        System.out.println("Liczba wszystkich linii w tekście książki: " + lines.size());





        for (int i = 0; i < lines.size(); i++) {
            System.out.println("Najdłuższy wiersz: " + i);
        }



    }


}
