package com.niit.shoppingcart2backend.dao;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart2backend.dao.CategoryDAO;
import com.niit.shoppingcart2backend.model.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean save(Category category) {
		try{
			sessionFactory.getCurrentSession().save(category);
			return true;
		    }
		catch(HibernateException e)
		{
			e.printStackTrace();
		    return false;
	     }
	}

	public boolean update(Category category) {
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		    }
		catch(HibernateException e)
		{
			e.printStackTrace();
		    return false;
	     }
		
	}

	public boolean delete(Category category) {
		try{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		    }
		catch(HibernateException e)
		{
			e.printStackTrace();
		    return false;
	     }
		
	}

	public Category get(String id)
	{
		return (Category) sessionFactory.getCurrentSession().get(Category.class,id);
		
	}

	public List<Category> list()
	{
		String hql="from Category";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
}

	
	