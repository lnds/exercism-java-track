import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) {
            return "";
        }
        var str = new StringBuffer();
        var elem = words[0];
        for (int i = 1; i < words.length; i++){
            str.append("For want of a ").append(words[i-1]);
            str.append(" the ").append(words[i]).append(" was lost.\n");
        }
        str.append("And all for the want of a ").append(elem).append('.');
        return str.toString();
    }

}
