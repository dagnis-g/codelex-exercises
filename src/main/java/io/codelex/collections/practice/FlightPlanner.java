package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scan = new Scanner(System.in);

        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        HashMap<String, List<String>> flightData = getDataFromListOfTextFile(lines);
        List<String> chosenCities = new ArrayList<>();

        for (Map.Entry<String, List<String>> i : flightData.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        System.out.println("From which city you would like to start travel?");
        String startCity = scan.nextLine();
        chosenCities.add(startCity);
        System.out.println("Destinations from " + startCity + " : ");
        flightData.get(startCity).forEach(System.out::println);

        while (true) {
            System.out.println("Choose your next destination: ");
            String nextCity = scan.nextLine();
            chosenCities.add(nextCity);
            if (nextCity.equals(startCity)) {
                System.out.println(chosenCities);
                break;
            }
            flightData.get(nextCity).forEach(System.out::println);
        }

    }

    public static HashMap<String, List<String>> getDataFromListOfTextFile(List<String> lines) {
        HashMap<String, List<String>> flightData = new HashMap<>();

        for (String line : lines) {
            String[] splitLine = line.split("->");
            String cityFrom = splitLine[0].trim();
            String cityTo = splitLine[1].trim();

            flightData.computeIfAbsent(cityFrom, k -> new ArrayList<>()).add(cityTo);
        }

        return flightData;
    }

}
