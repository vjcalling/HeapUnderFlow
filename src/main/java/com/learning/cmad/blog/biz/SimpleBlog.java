package com.learning.cmad.blog.biz;

import java.util.List;

import com.learning.cmad.blog.api.Blog;
import com.learning.cmad.blog.api.BlogException;
import com.learning.cmad.blog.api.BlogInterface;
import com.learning.cmad.blog.api.BlogNotFoundException;
import com.learning.cmad.blog.api.DuplicateBlogException;
import com.learning.cmad.blog.api.InvalidBlogException;
import com.learning.cmad.blog.data.BlogDAO;
import com.learning.cmad.blog.data.JPABlogDAO;
import com.learning.cmad.user.data.JPAUserDAO;
import com.learning.cmad.user.data.UserDAO;

public class SimpleBlog implements BlogInterface{

	private BlogDAO dao = new JPABlogDAO();

	@Override
	public void createBlog(Blog blog) throws InvalidBlogException, DuplicateBlogException, BlogException {

		dao.createBlog(blog);
	}

	@Override
	public List<Blog> getAllBlogs() throws BlogException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blog getBlogById(int id) throws BlogNotFoundException, BlogException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogsByAuthorId(int id) throws BlogNotFoundException, BlogException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBlog(Blog blog) throws InvalidBlogException, DuplicateBlogException, BlogException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlog(Blog blog) throws InvalidBlogException, DuplicateBlogException, BlogException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlogById(int id) throws InvalidBlogException, DuplicateBlogException, BlogException {
		// TODO Auto-generated method stub
		
	}

}
