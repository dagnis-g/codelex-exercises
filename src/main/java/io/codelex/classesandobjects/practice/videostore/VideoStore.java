package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    ArrayList<Video> videosInStock = new ArrayList<>();

    public void addMovieToInventory(String title) {
        Video video = new Video(title);
        videosInStock.add(video);
    }

    public void rentVideo(String video) {
        for (Video item : videosInStock) {
            if (item.getTitle().equals(video)) {
                item.rentVideo();
            }
        }
    }

    public void returnVideo(String video) {
        for (Video item : videosInStock) {
            if (item.getTitle().equals(video)) {
                item.returnVideo();
            }
        }
    }

    public void recieveUserRating(String video, int rating) {
        for (Video item : videosInStock) {
            if (item.getTitle().equals(video)) {
                item.calculateAverageRating(rating);
            }
        }
    }

    public ArrayList<Video> listVideosInStore() {
        return videosInStock;
    }

}
