package com.example.reviewsite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReviewRepositoryTest {

	@Test
	void shouldReturnTitleReviewOne() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(1).getTitle();
		String expected = "reviewOne";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnTitleReviewTwo() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(2).getTitle();
		String expected = "reviewTwo";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnImageURLReviewTwo() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(2).getTitle();
		String expected = "reviewTwo";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnUrlurlOne() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(1).getImageUrl();
		String expected = "urlOne";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnUrlurlTwo() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(2).getImageUrl();
		String expected = "urlTwo";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnCategoryOne() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(1).getCategory();
		String expected = "categoryOne";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnCategoryTwo() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(2).getCategory();
		String expected = "categoryTwo";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnContentOne() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(1).getContent();
		String expected = "contentOne";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnAuthorOne() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(1).getAuthor();
		String expected = "authorOne";
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldReturnAuthorTwo() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		String actual = reviewRepo.getReviewById(2).getAuthor();
		String expected = "authorTwo";
		//Assert
		assertEquals(expected, actual);		
	}
	
	@Test
	void shouldReturn3() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		int actual = reviewRepo.getReviews();
		int expected = 3;
		//Assert
		assertEquals(expected, actual);		
	}

	@Test
	void shouldContainTitleOneTwoAndThree() {
		// Arrange
		ReviewRepository reviewRepo = new ReviewRepository();
		//Act 
		reviewRepo.loadReviews();
		int actual = reviewRepo.getReviews();
		int expected = 3;
		//Assert
		assertEquals(expected, actual);		
	}

}
