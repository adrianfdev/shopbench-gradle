package org.adrianfdev.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewRepositoryTest {
    @Test
    public void canSearchForReviews(){
        ReviewRepository rp = new ReviewRepository();
        Review review = rp.searchForReviews("class");
        assertEquals("I really enjoyed Terry's class!",review.getText());
    }

}