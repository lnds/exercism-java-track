import java.math.BigInteger;

class Grains {

    static final BigInteger TWO = new BigInteger("2");

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        if (square == 1) {
            return BigInteger.ONE;
        }
        if (square == 2) {
            return TWO;
        }
        else {
            return TWO.multiply(grainsOnSquare(square-1));
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger sum = new BigInteger("0");
        for (int i = 1; i <= 64; ++i) {
            sum = sum.add(grainsOnSquare(i));
        }
        return sum;
    }

}
