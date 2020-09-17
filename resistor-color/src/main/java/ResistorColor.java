class ResistorColor {

    int colorCode(String color) {
        String[] c = this.colors();
        for (int i = 0; i < c.length; i++) {
            if (c[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }

    static String[] colorValues = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    String[] colors() {
        return colorValues;
    }
}
