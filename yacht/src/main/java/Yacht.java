class Yacht {

    int points = 0;
    Yacht(int[] dice, YachtCategory yachtCategory) {
        switch (yachtCategory) {
            case ONES:
                points = checkValues(dice, 1);
                break;
            case TWOS:
                points = checkValues(dice, 2);
                break;
            case THREES:
                points = checkValues(dice, 3);
                break;
            case FOURS:
                points = checkValues(dice, 4);
                break;
            case FIVES:
                points = checkValues(dice, 5);
                break;
            case SIXES:
                points = checkValues(dice, 6);
                break;
            case FULL_HOUSE:
                points = checkFullHouse(dice);
                break;
            case FOUR_OF_A_KIND:
                points = checkFourOfAKind(dice);
                break;
            case LITTLE_STRAIGHT:
                if (sumDices(dice) == 15) {
                    points = 30;
                }
                break;
            case BIG_STRAIGHT:
                if (sumDices(dice) == 20) {
                    points = 30;
                }
                break;
            case CHOICE:
                points = sumDices(dice);
                break;
            case YACHT:
                if (sameFace(dice)) {
                    points = 50;
                }
                break;
            default:
                break;
        }
    }

    boolean sameFace(int[] dices) {
        return sumDices(dices) == 5*dices[0];
    }

    int sumDices(int[] dices) {
        int sum = 0;
        for (int d: dices) {
            sum += d;
        }
        return sum;
    }
    
    
    int checkValues(int[] dices, int val) {
        int sum = 0;
        for (int d: dices) {
            if (d == val) {
                sum += val;
            }
        }
        return sum;
    }

    int checkFullHouse(int[] dices) {
        int first = 0;
        int second = 0;
        int count_first = 0;
        int count_second = 0;
        for (int d: dices) {
            if (first == 0) {
                first = d;
            }
            else if (second == 0 && d != first) {
                second = d;
            }
            if (d == first) {
                ++count_first;
            }
            else if (d == second) {
                ++count_second;
            }
            else {
                return 0;
            }
        }
        if (count_first + count_second != 5 || count_first < 2 || count_second < 2) {
            return 0;
        }
        return count_first*first + count_second*second;
    }

    int checkFourOfAKind(int[] dices) {
        int first = 0;
        int second = 0;
        int count_first = 0;
        int count_second = 0;
        for (int d: dices) {
            if (first == 0) {
                first = d;
            }
            else if (second == 0 && d != first) {
                second = d;
            }
            if (d == first) {
                ++count_first;
            }
            else if (d == second) {
                ++count_second;
            }
            else {
                return 0;
            }
        }
        if (count_first + count_second != 5) {
            return 0;
        }
        if (count_first >= 4) {
            return 4 * first;
        }
        if (count_second >= 4) {
            return 4 * second;
        }
        return 0;
    }

    int score() {
        return points;
    }

}
