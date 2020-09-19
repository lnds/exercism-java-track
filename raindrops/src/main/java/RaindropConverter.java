class RaindropConverter {

    String convert(int number) {
        StringBuffer buf = new StringBuffer();
        if (number % 3 == 0) {
            buf.append("Pling");
        }
        if (number % 5 == 0) {
            buf.append("Plang");
        }
        if (number % 7 == 0) {
            buf.append("Plong");
        }
        if (buf.length() == 0) {
            buf.append(String.valueOf(number));
        }
        return buf.toString();
    }

}
