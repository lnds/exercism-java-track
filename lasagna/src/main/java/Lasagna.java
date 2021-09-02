public class Lasagna {
    int expectedMinutesInOven() {
        return 40;
    }

    int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
