package com.example.reviewsite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reviews")
@Controller
public class ReviewController {
	

	@Resource
	private ReviewRepository reviewRepo; 
	
	@GetMapping("")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.getReviews());
		return "reviews";
	}

	@GetMapping("/{id}")
	public String findReview(@PathVariable(value="id")Long id, Model model) throws ReviewNotFoundException { 
		
		if(reviewRepo.getReviewById(id) == null) {
			return "review-not-found";
		}
		
		if(reviewRepo.getReviewById(id) == null) {
			throw new ReviewNotFoundException();
		}
		
		model.addAttribute("review", reviewRepo.getReviewById(id));
		return "review";
	}

}
