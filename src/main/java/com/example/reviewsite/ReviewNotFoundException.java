package com.example.reviewsite;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason ="Review does not exist.") 
public class ReviewNotFoundException extends Exception {

}
