package com.brendon.moviereviewsfirebase;

import java.util.Date;



public class MovieReview {

    String name;
    String reviewText;
    float stars;
    Date date;

    @Override
    public String toString() {
        return "MovieReview{" +
                "name= " + name + '\'' +
                ", reviewText= " + reviewText + '\'' +
                ", stars=" + stars +
                ", date=" + date + "}";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    MovieReview(String name, String reviewText, float stars) {

        this.name = name;
        this.reviewText = reviewText;
        this.stars = stars;
        this.date = new Date();

    }

    MovieReview() {

    }
}
