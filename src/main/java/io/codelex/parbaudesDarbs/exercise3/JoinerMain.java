package io.codelex.parbaudesDarbs.exercise3;

public class JoinerMain {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join(1, 2, 2, 2, 2, 2, 2, 2, 2, 2));
    }
}
