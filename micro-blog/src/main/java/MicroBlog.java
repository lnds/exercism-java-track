class MicroBlog {
    public String truncate(String input) {
        int codePoints = input.codePointCount(0, input.length());
        return input.substring(0, input.offsetByCodePoints(0, Math.min(5, codePoints)));
    }
}
