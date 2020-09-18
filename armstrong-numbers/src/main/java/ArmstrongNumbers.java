class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int power = (int) Math.log10(numberToCheck) + 1;
        int num = numberToCheck;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power);
            num /= 10;
        }
        return numberToCheck == sum;

    }

}
