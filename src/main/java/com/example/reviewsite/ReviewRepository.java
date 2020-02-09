package com.example.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<Long, Review>();
	
	Review reviewOne = new Review(1L, "War and Peace", "https://upload.wikimedia.org/wikipedia/commons/a/af/Tolstoy_-_War_and_Peace_-_first_edition%2C_1869.jpg", "novel", "A wonderful book with lots of characters.", "Leo Tolstoy");
	Review reviewTwo = new Review(2L, "Crime and Punishment", "/images/crimeAndPunishment.png", "novel", "A book about sanity, and lack there of.", "Fyodor Dostoevsky");
	Review reviewThree = new Review(3L, "The Idiot", "/images/theIdiot.jpg", "novel", "A book about kindness.", "Fyodor Dostoevsky");
	
	public ReviewRepository() {
		this.reviewList.put(reviewOne.getId(), reviewOne);
		this.reviewList.put(reviewTwo.getId(), reviewTwo);
		this.reviewList.put(reviewThree.getId(), reviewThree);
	}
	
	public void loadReviews() {
		Review reviewOne = new Review(1, "reviewOne", "urlOne", "categoryOne", "contentOne", "authorOne");
		Review reviewTwo = new Review(2, "reviewTwo", "urlTwo", "categoryTwo", "contentTwo", "authorTwo");
		Review reviewThree = new Review(3, "reviewThree", "urlThree", "categoryThree", "contentThree", "authorThree");
		reviewList.put(reviewOne.getId(), reviewOne);
		reviewList.put(reviewTwo.getId(), reviewTwo);
		reviewList.put(reviewThree.getId(), reviewThree);
	}

	public Review getReviewById(long key) {
		
		return reviewList.get(key);
	}

	public Collection<Review> getReviews() {

		return reviewList.values();
	}

}
