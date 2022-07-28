import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                System.out.println("Timpul standard de asteptare pentru a se face o lasagna este de " + Lasagna.expectedMinutesInOven() + " minute.");
                System.out.println("Mai aveti de asteptat inca " + Lasagna.remainingMinutesInOven() + " minute.");
                System.out.println("Numarul de straturi puse pe lasagna: " + Lasagna.preparationTimeInMinutes(2));
                System.out.println("Lasagna a stat la cuptor: " + Lasagna.totalTimeInMinutes(3, 20) + " minute.");
                System.out.println(AnnalynsInfiltration.canFastAttack());
                System.out.println(AnnalynsInfiltration.canSpy());
                System.out.println(AnnalynsInfiltration.canSignalPrisoner());
                System.out.println(AnnalynsInfiltration.canFreePrisoner(false, true, false, false));
                System.out.println(Blackjack.parseCard("ace"));
                System.out.println(Blackjack.isBlackJack("king","ace"));
                System.out.println(Blackjack.largeHand(true, 7));
                System.out.println(Blackjack.smallHand(15,12));
                System.out.println(Blackjack.firstTurn("two", "four", "ace"));
                BirdWatcher.getLastWeek();

                System.out.println("Introduceti un prim numar: ");

                Scanner numere = new Scanner(System.in);
                int numar1 = numere.nextInt();
                int b = (int) (Math.random() * 100);
                if (b > numar1) {
                    System.out.println("Numarul random generat " + b + " este mai mare decat numarul introdus.");
                } else {
                    System.out.println("Numarul random generat " + b + " este mai mic decat numarul introdus.");
                }
                PunctulB.ex2();
                PunctulB.ex3();
                PunctulB.ex4();
                PunctulB.ex5();
                PunctulB.ex6();
                PunctulB.ex7();
                PunctulB.ex8();
            }
        }
