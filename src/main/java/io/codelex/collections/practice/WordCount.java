package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());

        List<String> lines = Files.readAllLines(path, charset);
        System.out.println("Words = " + lines.size());

        String[] textString = String.valueOf(Files.readAllLines(path, charset)).split("\\s+");
        System.out.println("Words = " + textString.length);

        char[] textChars = String.valueOf(Files.readAllLines(path, charset)).toCharArray();
        int charCount = 0;
        for (char i : textChars) {
            if (Character.isLetterOrDigit(i)) {
                charCount++;
            }
        }
        System.out.println("Chars = " + charCount);

    }
}
