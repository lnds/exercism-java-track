import java.util.HashSet;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        HashSet<Character> map = input.toLowerCase().chars().mapToObj(i -> (char)i).filter(Character::isAlphabetic).collect(Collectors.toCollection(HashSet::new));
        return map.size() == 26;
    }

}
