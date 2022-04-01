package io.codelex.parbaudesDarbs.exercise4;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderAndReverseWriter {
    public String readText(String fileName) throws IOException, URISyntaxException {
        Path path = Paths.get(Objects.requireNonNull(FileReaderAndReverseWriter.class.getClassLoader()
                .getResource(fileName)).toURI());
        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();
        return data;
    }

    public void writeToTextFile(String filePath, String textToWrite) throws IOException {
        Path path = Paths.get(filePath);
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(String.valueOf(path)), StandardCharsets.UTF_8));

        StringBuilder builder = new StringBuilder(textToWrite);
        String reversedText = builder.reverse().toString();

        writer.write(reversedText);

        writer.flush();
        writer.close();
    }
}
