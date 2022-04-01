package io.codelex.parbaudesDarbs.exercise3;

public class Joiner {
    private String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public <T> String join(T... items) {

        StringBuilder result = new StringBuilder();
        for (T i : items) {
            result.append(i).append(seperator);
        }
        return result.substring(0, result.length() - 1);
    }
}
