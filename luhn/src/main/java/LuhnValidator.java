import java.util.stream.Collectors;
import java.util.Arrays;

class LuhnValidator {

    boolean isValid(String candidate) {
        
        var candidateWithoutSpaces = candidate.replace(" ", "");
        if (candidateWithoutSpaces.length() <= 1 || !candidateWithoutSpaces.matches("[0-9]+")) {
            return false;
        }

        var digits = candidateWithoutSpaces
            .chars().map(Character::getNumericValue).toArray();

        for (int i = digits.length-2; i >= 0; i-=2) {
            digits[i] = digits[i]*2;
            if (digits[i] > 9) {
                digits[i] = digits[i]-9;
            }
        }

        return Arrays.stream(digits).sum() % 10 == 0;
    }

}
