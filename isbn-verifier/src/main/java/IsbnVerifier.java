import java.util.stream.Collectors;

class IsbnVerifier {

    static final int ISBN_LENGTH = 10;

    boolean isValid(String stringToVerify) {
        int[] isbn = stringToVerify.chars().filter(c -> Character.isDigit(c) || c == 'x' || c == 'X')
            .toArray();
        if (isbn.length == ISBN_LENGTH)
            return checkSum(isbn) == 0;
        return false;
    }

    int checkSum(int[] isbn) {
        int sum = 0;
        for (int i = 0; i < ISBN_LENGTH;i++) {
            int ch = isbn[i];
            int v = (ch == 'x' || ch == 'X') ? 10 : Character.digit(ch, 10);
            if (v == 10 && i < ISBN_LENGTH-1) {
                break;
            }
            sum += (10 - i) *  v;
        }
        return (sum % 11);
    }

}
