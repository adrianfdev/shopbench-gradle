package org.adrianfdev.model;

import java.util.ArrayList;
import java.util.List;

public class ReviewRepository {
    List<Review> reviews = new ArrayList<>();
    public ReviewRepository() {
        reviews.add(new Review("I really enjoyed Terry's class!"));
        reviews.add(new Review("Love it"));
        reviews.add(new Review("Great!"));
        reviews.add(new Review("Its the best!"));
    }

    public Review searchForReviews(String keyword) {

        for (Review review : reviews) {
            if (review.getText().contains(keyword)) {
                return review;
            }
        }
            return null;

    }

    public String abbreviateText(String text, int numberChar){

        int total = text.length();
        String abbreviated = text.substring(0,300);
        int updated = abbreviated.length();
        return abbreviated + "...";
    }
}
