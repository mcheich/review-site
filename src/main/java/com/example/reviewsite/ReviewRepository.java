package com.example.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<Long, Review>();
	
	public void loadReviews() {
		Review reviewOne = new Review("reviewOne", "urlOne", "categoryOne", "contentOne", "authorOne");
		Review reviewTwo = new Review("reviewTwo", "urlTwo", "categoryTwo", "contentTwo", "authorTwo");
		reviewList.put((long) 1, reviewOne);
		reviewList.put((long) 2, reviewTwo);
	}

	public Review getReviewById(long key) {
		
		return reviewList.get(key);
	}

	public Collection getReviews() {
		// TODO Auto-generated method stub
		return 3;
	}

}
