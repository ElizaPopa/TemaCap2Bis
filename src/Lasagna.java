public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }
    public static int remainingMinutesInOven() {
        int a = 30;
        return expectedMinutesInOven() - a;
    }
    public static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public static int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
