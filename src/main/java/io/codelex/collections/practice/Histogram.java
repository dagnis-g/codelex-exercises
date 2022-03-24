package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        List<String> scoreList = new ArrayList<>(List.of(scores.split(" ")));

        HashMap<String, String> result = new LinkedHashMap<>();
        result.put("00-09", "");
        result.put("10-19", "");
        result.put("20-29", "");
        result.put("30-39", "");
        result.put("40-49", "");
        result.put("50-59", "");
        result.put("60-69", "");
        result.put("70-79", "");
        result.put("80-89", "");
        result.put("90-99", "");
        result.put("100", "");

        for (String score : scoreList) {
            int num = Integer.parseInt(score);

            if (num >= 0 && num <= 9) {
                result.put("00-09", result.get("00-09") + "*");
            } else if (num >= 10 && num <= 19) {
                result.put("10-19", result.get("10-19") + "*");
            } else if (num >= 20 && num <= 29) {
                result.put("20-29", result.get("20-29") + "*");
            } else if (num >= 30 && num <= 39) {
                result.put("30-39", result.get("30-39") + "*");
            } else if (num >= 40 && num <= 49) {
                result.put("40-49", result.get("40-49") + "*");
            } else if (num >= 50 && num <= 59) {
                result.put("50-59", result.get("50-59") + "*");
            } else if (num >= 60 && num <= 69) {
                result.put("60-69", result.get("60-69") + "*");
            } else if (num >= 70 && num <= 79) {
                result.put("70-79", result.get("70-79") + "*");
            } else if (num >= 80 && num <= 89) {
                result.put("80-89", result.get("80-89") + "*");
            } else if (num >= 90 && num <= 99) {
                result.put("90-99", result.get("90-99") + "*");
            } else if (num == 100) {
                result.put("100", result.get("100") + "*");
            }
        }

        for (Map.Entry<String, String> i : result.entrySet()) {
            System.out.printf("%5s", i.getKey());
            System.out.print(": " + i.getValue());
            System.out.println();
        }

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
