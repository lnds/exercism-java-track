import java.util.stream.*;
import java.util.Arrays;

class SumOfMultiples {

    int sum;

    SumOfMultiples(int number, int[] set) {
        this.sum = IntStream.range(1, number).filter(x -> multiples(x, set)).sum();
    }

    int getSum() {
        return this.sum;
    }

    private boolean multiples(int n, int[] set) {
        for (int x: set) {
            if (x > 0 && (n % x) == 0) {
                return true;
            }
        }
        return false;
    }

}
