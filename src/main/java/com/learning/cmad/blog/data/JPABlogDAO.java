package com.learning.cmad.blog.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.learning.cmad.blog.api.Blog;
import com.learning.cmad.user.api.User;

public class JPABlogDAO implements BlogDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_db");
	private EntityManager em = emf.createEntityManager();
	
	
	@Override
	public void createBlog(Blog blog) {
		em.getTransaction().begin();
		em.persist(blog);
		em.getTransaction().commit();
		em.close();		
	}

	@Override
	public List<Blog> getAllBlogs() {
		Query query = em.createQuery("from Blog");
		List<Blog> blogs = query.getResultList();
		return blogs;
	}

	@Override
	public Blog getBlogById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogsByAuthorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlogById(int id) {
		// TODO Auto-generated method stub
		
	}

}
