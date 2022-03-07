package io.codelex.classesandobjects.exercises.exercise4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] moviesPG = new Movie[movies.length];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                moviesPG[index] = movie;
            }
            index++;
        }
        return moviesPG;
    }

    @Override
    public String toString() {
        return
                "Title='" + title + '\'' +
                        ", studio='" + studio + '\'' +
                        ", rating='" + rating + '\'';
    }
}
