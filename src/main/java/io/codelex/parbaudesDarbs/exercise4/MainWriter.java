package io.codelex.parbaudesDarbs.exercise4;

import java.io.IOException;
import java.net.URISyntaxException;

public class MainWriter {
    public static void main(String[] args) throws IOException, URISyntaxException {
        FileReaderAndReverseWriter writer = new FileReaderAndReverseWriter();
        String text = writer.readText("textToRead.txt");
        writer.writeToTextFile("src/main/resources/reversedText.txt", text);
    }
}
