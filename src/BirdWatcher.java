public class BirdWatcher {
    public static int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static void getLastWeek() {
        int[] pasari = {0, 2, 5, 3, 7, 8, 4};
        System.out.println(pasari[0] + " " + pasari[1] + " " + pasari[2] + " " + pasari[3] + " " + pasari[4] + " " + pasari[5] + " " + pasari[6]);
    }

//    public static int getToday() {
//        if (birdsPerDay.length == 0) {
//            return 0;
//        } else {
//            return birdsPerDay[birdsPerDay.length - 1];
//        }
//    }
//
//    public static void incrementTodaysCount() {
//        birdsPerDay[6] = birdsPerDay[6] + 1;
//    }
//    public boolean hasDaysWithoutBirds() {
//        boolean noBirds = false;
//        for (int i = 0; i < 7; i++) {
//            if (birdsPerDay[i]) == 0) {
//        noBirds = true;
//        break;
//        } else {
//        return noBirds;
//            }
//        }
//    }
//
//    public int getCountForFirstDays(int numberOfDays) {
//    int firstdays = 0;
//    if (numberOfDays > 7) {
//        numberOfDays = 7;
//    }
//    for (int i = 0; i < numberOfDays; i++) {
//        firstdays += birdsPerDay[i];
//    } return firstdays;
//            }
}
//
//
//        int[] pasare = new int[7];
//
//        pasare[0] = 0;
//        pasare[1] = 2;
//        pasare[2] = 5;
//        pasare[3] = 3;
//        pasare[4] = 7;
//        pasare[5] = 8;
//        pasare[6] = 4;
//
//
//
//    }
//

//public static int getBusyDays() {
//        int[]  birdsPerDay = { 2, 5, 0, 7, 4, 1 };
//        int a = 0;
//        for (int i : birdsPerDay) {
//        if (i >= 5) a++;
//        }
//        return a;
//        }
//        }
