class Scrabble {

    int score = 0;

    Scrabble(String word) {
        String w = word.toUpperCase();
        for (int i = 0; i < w.length(); i++) {
            Character c = w.charAt(i);
            score += letterScore(c);
        }
    }

    int letterScore(Character c) {
        switch (c) {
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'R': case 'S': case 'T':
                return 1;
            case 'D': case 'G':
                return 2;
            case 'B': case 'C': case 'M': case 'P':
                return 3;
            case 'F': case 'H': case 'V': case 'W': case 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J': case 'X':
                return 8;
            case 'Q': case 'Z':
                return 10;
            default:
                return 0;
        }
    }

    int getScore() {
        return score;
    }

}
