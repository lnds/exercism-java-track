class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int s = ((input+1)*input)/2;
        return s * s;
    }

    int computeSumOfSquaresTo(int input) {
        return (input*(input+1)*(2*input+1)) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
