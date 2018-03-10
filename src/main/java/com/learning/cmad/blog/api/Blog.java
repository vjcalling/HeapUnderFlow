package com.learning.cmad.blog.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.learning.cmad.user.api.User;

@Entity
public class Blog {

	
	@ManyToOne
    @JoinColumn(name="userId", nullable=false)
	private User user;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int blogId;
	private String blogTitle;
	private int blogAuthorId;
	private Date blogCreation;
	
	public Blog(){
		
	}
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	
	public int getBlogAuthorId() {
		return blogAuthorId;
	}
	public void setBlogAuthorId(int blogAuthorId) {
		this.blogAuthorId = blogAuthorId;
	}
	public Date getBlogCreation() {
		return blogCreation;
	}
	public void setBlogCreation(Date blogCreation) {
		this.blogCreation = blogCreation;
	}
	
}

