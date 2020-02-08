package com.example.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<Long, Review>();
	
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
