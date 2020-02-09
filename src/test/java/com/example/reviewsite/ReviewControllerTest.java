package com.example.reviewsite;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
class ReviewControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	private Review reviewOne;

	@Mock
	private Review reviewTwo;
	
	@MockBean
	private ReviewRepository reviewRepo;
	
	/* Question - Why does this prompt "throws Exception" */
	@Test
	public void shouldGetStatusOfOkWhenNavigatingToAllReviews() throws Exception {
		this.mockMvc.perform(get("/reviews")).andExpect(status().isOk())
		.andExpect(view().name("reviews"));
	}
	
	@Test
	public void shouldGetStatusOfOkWhenNavigatingToSingleReview() throws Exception {
		when(reviewRepo.getReviewById(1L)).thenReturn(reviewOne);
		this.mockMvc.perform(get("/reviews/1")).andExpect(status().isOk())
		.andExpect(view().name("review"));
	}
	
	@Test
	public void shouldAddAllReveiwsToTheModel() throws Exception {
		when(reviewRepo.getReviews()).thenReturn(Arrays.asList(reviewOne, reviewTwo));
		this.mockMvc.perform(get("/reviews"))
		.andExpect(model().attribute("reviews", hasSize(2)));
	}
	
	@Test
	public void shouldAddSingleReveiwToTheModel() throws Exception {
		when(reviewRepo.getReviewById(1L)).thenReturn(reviewOne);
		this.mockMvc.perform(get("/reviews/1"))
		.andExpect(model().attribute("review", is(reviewOne)));
	}
	
	@Test
	public void shouldReturnNotFoundForBadRequest() throws Exception {
		when(reviewRepo.getReviewById(5L)).thenReturn(null);
		this.mockMvc.perform(get("/reviews/5"))
		.andExpect(view().name("review-not-found"));
	}
	

}
