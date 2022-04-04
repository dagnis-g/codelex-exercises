package io.codelex.parbaudesDarbs.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner {
    private String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public <T> String join(T... items) {

        List<T> list = Arrays.asList(items);
//        List<String> stringList = list.stream()
//                .map(Objects::toString)
//                .toList();
//        return String.join(seperator, stringList);

        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(seperator));
    }
}
