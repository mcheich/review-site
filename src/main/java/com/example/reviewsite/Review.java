package com.example.reviewsite;

public class Review {

	private long id;
	private String title;
	private String imageUrl;
	private String category;
	private String content;
	private String author;
	
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {		
		return this.imageUrl;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public Review(long id, String title, String urlImage, String category, String content, String author) {
		this.id = id;
		this.title = title;
		this.imageUrl = urlImage;
		this.category = category;
		this.content = content;
		this.author = author;
	}

}
