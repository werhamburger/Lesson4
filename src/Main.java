import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int zmienna = rand.nextInt(5) + 2;
        boolean czyPrawda;
        if (czyPrawda = (zmienna == 2))
            System.out.println("Wyniesie 2:" + " " + czyPrawda);
        else if (czyPrawda = (zmienna == 3)) {
            System.out.println("Wyniesie 3"+ " " + czyPrawda);
        } else if (czyPrawda = (zmienna == 4)) {
            System.out.println("Wyniesie 4"+ " " + czyPrawda);
        }
        else if (czyPrawda = (zmienna == 5)) {
            System.out.println("Wyniesie 5"+ " " + czyPrawda);
        } else if (czyPrawda = (zmienna == 6)) {
            System.out.println("Wyniesie 6"+ " " + czyPrawda);

        }
        else {
            System.out.println("Cos się wysrało :)");
        }
        char[] literki = {'A', 'L', 'A', ' ', 'M', 'A', ' ', 'K', 'O', 'T', 'A', '.'};
        System.out.println(""+ literki[1] + literki [0] + literki [4] + literki [0]);


        String napis = "LAMA";
        int dlugosc = napis.length();
        if (dlugosc > 5)
            System.out.println("Dlugosc wyrazu jest wieksza od 5");
        else {
            System.out.println("Dlugosc wyrazu nie jest wieksza od 5");
        }


    }
}