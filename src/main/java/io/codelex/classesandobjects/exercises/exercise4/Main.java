package io.codelex.classesandobjects.exercises.exercise4;

public class Main {
    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista International", "PG13");
        Movie spiderMan = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");

        Movie[] movies = {casinoRoyale, glass, spiderMan};

        System.out.println("PG Rated movies: ");
        for (Movie movie : Movie.getPG(movies)) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
    }
}
