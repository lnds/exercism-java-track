class Acronym {

    private String acronym;

    Acronym(String phrase) {
        StringBuffer buf = new StringBuffer();
        for (String word: phrase.split("(\\s|-)+")) {
            if (word.startsWith("_")) {
                buf.append(word.substring(1,2).toUpperCase());
            } else {
                buf.append(word.substring(0,1).toUpperCase());
            }
        }
        acronym = buf.toString();
    }

    String get() {
        return acronym;
    }

}
