import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class ResistorColorDuo {

    int value(String[] colors) {
        return Arrays.asList(colors).stream().limit(2)
                    .map((c) -> colorCode(c)).reduce(0, (sum, val) -> sum * 10 + val);
    }
        
    int colorCode(String color) {
        for (int i = 0; i < colorValues.length; i++) {
            if (colorValues[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }

    static String[] colorValues = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

}
