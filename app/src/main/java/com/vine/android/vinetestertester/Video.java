package com.vine.android.vinetestertester;

import java.util.ArrayList;

/**
 * @author aneeshashutosh
 */
public final class Video {
    private int videoURL;
    private int thumbnailURL;
    private int likes;
    private int favs;
    private ArrayList<String> comments;
    private String caption;

    public Video() {

    }

    public int getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(int videoURL) {
        this.videoURL = videoURL;
    }

    public int getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(int thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getFavs() {
        return favs;
    }

    public void setFavs(int favs) {
        this.favs = favs;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void incrementLikes() {
        this.likes++;
    }

    public void incrementFavs() {
        this.favs++;
    }

    public void decrementFavs() {
        this.favs--;
    }
}
