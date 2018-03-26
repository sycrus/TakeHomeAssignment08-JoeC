package com.example.joe.instagramclone;

/**
 * Created by joe on 3/25/18.
 */

public class Post {

    public int userPhotoId;
    public int userName;
    public int userLocation;
    public int postPhotoId;
    public int postText;
    public boolean isLiked;



    public Post(int userPhotoId, int userName, int userLocation, int postPhotoId, int postText, boolean isLiked) {
        this.userPhotoId = userPhotoId;
        this.userName = userName;
        this.userLocation = userLocation;
        this.postPhotoId = postPhotoId;
        this.postText = postText;
        this.isLiked = isLiked;
    }

    public int getUserPhotoId() {
        return userPhotoId;
    }

    public void setUserPhotoId(int userPhotoId) {
        this.userPhotoId = userPhotoId;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public int getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(int userLocation) {
        this.userLocation = userLocation;
    }

    public int getPostPhotoId() {
        return postPhotoId;
    }

    public void setPostPhotoId(int postPhotoId) {
        this.postPhotoId = postPhotoId;
    }

    public int getPostText() {
        return postText;
    }

    public void setPostText(int postText) {
        this.postText = postText;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }


}
