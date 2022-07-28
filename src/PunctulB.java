import java.util.ArrayList;
import java.util.Scanner;

public class PunctulB {

    static void ex2() {
        System.out.println("Introduceti primul numar intreg: ");
        Scanner numar = new Scanner(System.in);
        int primNumar = numar.nextInt();
        System.out.println("Introduceti al doilea numar intreg: ");
        int numarDoi = numar.nextInt();
        System.out.println("-'a': adaugare\n" +
                "-'s': scadere\n" +
                "-'i': inmultire\n" +
                "-'p': impartire\n" +
                "-'m': modul: \n" +
                "Selectati un caracter: ");
        Scanner caracter = new Scanner(System.in);
        String cara = caracter.next();
        switch (cara) {
            case "a": {
                System.out.println("Rezultat adunare: " + (primNumar + numarDoi));
                break;
            }
            case "s": {
                System.out.println("Rezultat scadere: " + (primNumar - numarDoi));
                break;
            }
            case "i": {
                System.out.println("Rezultat inmultire: " + (primNumar * numarDoi));
                break;
            }
            case "p": {
                System.out.println("Rezultat impartire: " + (primNumar / numarDoi));
                break;
            }
            case "m": {
                System.out.println("Rezultat modul: " + (primNumar % numarDoi));
                break;
            }
            default: {
                System.out.println("Invalid");
                break;
            }
        }
    }

    static void ex3() {
        String dublu[][] = {
                {"carte", "creion", "stilou"},
                {"penar", "pix", "caiet", "coperta", "ghiozdan"}};
        System.out.println(dublu[0][0] + " " + dublu[0][2]);
        System.out.println(dublu[1][0] + " " + dublu[1][4]);
    }

    static void ex4() {
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 1; i < alfabet.length; i += 2) {
            System.out.println(alfabet[i]);
        }
    }

    static void ex5() {
        double[] zecimale = {23.5, 12.4, 4.5, 8.1, 7.9, 3.6};
        for (int i = 0; i < zecimale.length; i++) {
            if (zecimale[i] == 4.5) {
                System.out.println(zecimale[i]);
            }
            if (zecimale[i] > 5) {
                System.out.println("Element peste 5");
            }
        }
    }

    public static void ex6() {
        int[] multe = {-3, 5, 6, 43, 23, 67, 975, 1001, 10};
        for (int i = 0; i < multe.length; i++) {
            if (i == 2) {
                i++;
                i--;
                System.out.println(multe[i]);
            } else if (i == 6) {
                System.out.println("Pana aici");
                break;
            } else {
                System.out.println("Index valid");
            }
        }
        }

    static void ex7() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(75);
        numbers.add(33);
        numbers.add(102);
        System.out.println("Suma tuturor numerelor din lista este: " + (numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3) + numbers.get(4)));
        }

    static void ex8() {
        String[] array = {};
        ArrayList<String> sir = new ArrayList<>();
        if (array.length == 0) {
            System.out.println("Sirul array este gol");
        }
        if (sir.size() == 0) {
            System.out.println("Lista sir este goala");
        }
    }
}




