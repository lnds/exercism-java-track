class NaturalNumber {

    private int sumFactors;
    private int num;

    NaturalNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        sumFactors = calcSumFactors(n);
        num = n;
    }

    private int calcSumFactors(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }

    Classification getClassification() {
        if (sumFactors == num) {
            return Classification.PERFECT;
        }
        else if (sumFactors > num) {
            return Classification.ABUNDANT;
        }
        return Classification.DEFICIENT;
    }

}
