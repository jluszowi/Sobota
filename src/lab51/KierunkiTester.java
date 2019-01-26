package lab51;

public class KierunkiTester {

    public static void main(String[] args) {


        for (Kierunki k : Kierunki.values()) {


            System.out.println("Kierunek: " + k.getAngielskaNazwa() + ", " + k.getSkrót() + ", " + k.getPolskaNazwa());

        }

    }
}
