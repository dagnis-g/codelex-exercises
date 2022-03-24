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

        String userChoice;
        while (true) {
            System.out.println("""
                    What would you like to do?
                    To display cities press 1
                    To exit program press #""");

            userChoice = scan.nextLine();
            if (userChoice.equals("1")) {
                displayAllCitiesAndDestinations(flightData);
                break;
            } else if (userChoice.equals("#")) {
                System.out.println("Bye!");
                System.exit(0);
            } else {
                System.out.println("Unknown command, try again..");
            }
        }

        List<String> chosenCities = new ArrayList<>();
        String startCity;

        while (true) {
            System.out.println("To select a city from which you would like to start press 1\n" +
                    "To exit press #");
            userChoice = scan.nextLine();
            if (userChoice.equals("1")) {
                System.out.println("From which city you would like to start travel?");
                startCity = scan.nextLine();
                if (!flightData.containsKey(startCity)) {
                    System.out.println("No such city...");
                    continue;
                }
                chosenCities.add(startCity);
                System.out.println("Destinations from " + startCity + " : ");
                flightData.get(startCity).forEach(System.out::println);
                break;
            } else if (userChoice.equals("#")) {
                System.out.println("Bye!");
                System.exit(0);
            } else {
                System.out.println("Unknown command, try again..");
            }
        }

        while (true) {
            System.out.println("Choose your next destination: ");
            String nextCity = scan.nextLine();
            if (!flightData.containsKey(nextCity)) {
                System.out.println("No such destination, try again..");
                continue;
            }
            chosenCities.add(nextCity);
            if (nextCity.equals(startCity)) {
                System.out.print("All the cities in your travel: ");
                for (String city : chosenCities) {
                    System.out.print(city + " ");
                }
                break;
            }
            flightData.get(nextCity).forEach(System.out::println);
        }
    }

    private static void displayAllCitiesAndDestinations(HashMap<String, List<String>> flightData) {
        System.out.println("Cities and their destinations");
        for (Map.Entry<String, List<String>> i : flightData.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }

    private static HashMap<String, List<String>> getDataFromListOfTextFile(List<String> lines) {
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
