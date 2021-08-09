import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwelveDays {

    private static String[] ords = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth", "eleventh", "twelfth", };

    private static String[] gifts = { "a Partridge", "two Turtle Doves", "three French Hens", "four Calling Birds",
            "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking",
            "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming", };

    String verse(int verseNumber) {
        var buffer = new StringBuffer();
        buffer.append("On the ").append(ords[verseNumber - 1]);
        buffer.append(" day of Christmas my true love gave to me: ");
        buffer.append(giftVerse(verseNumber - 1));
        buffer.append(" in a Pear Tree.\n");
        return buffer.toString();
    }

    private String giftVerse(int n) {
        var buffer = new StringBuffer();
        for (int i = n; i > 0; --i) {
            buffer.append(gifts[i]).append(", ");
        }
        if (n > 0) {
            buffer.append("and ");
        }
        buffer.append(gifts[0]);
        return buffer.toString();
    }

    String verses(int startVerse, int endVerse) {
        return IntStream.rangeClosed(startVerse, endVerse).mapToObj(i -> this.verse(i))
                .collect(Collectors.joining("\n"));
    }

    String sing() {
        return verses(1, 12);
    }
}
