import java.util.Optional;

class CollatzCalculator {

    int computeStepCount(int start) {
        return collatz(start).get();
    }


    Optional<Integer> collatz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        } else if (n == 1) {
            return Optional.of(0);
        } else if (n % 2 == 0) {
            return collatz(n/2).flatMap((r) -> Optional.of(r + 1));
        } else {
            return collatz(n * 3 + 1).flatMap((r) -> Optional.of(r + 1));
        }
    }
}
