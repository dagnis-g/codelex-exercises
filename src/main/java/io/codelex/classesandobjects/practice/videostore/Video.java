package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private final String title;
    private boolean isCheckedOut;
    private double averageUserRating;
    private int timesRented = 0;
    private int sumOfRatings;

    public Video(String title) {
        timesRented++;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void rentVideo() {
        this.timesRented++;
        this.isCheckedOut = true;
    }

    public void returnVideo() {
        this.isCheckedOut = false;
    }
    
    public void calculateAverageRating(int rating) {
        if (!isCheckedOut) {
            this.sumOfRatings += rating;
            this.averageUserRating = (double) sumOfRatings / timesRented;
        } else {
            System.out.println("Movie already rented");
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", averageUserRating=" + averageUserRating +
                '}';
    }
}
