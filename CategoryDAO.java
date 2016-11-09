package com.niit.shoppingcart2backend.dao;

import com.niit.shoppingcart2backend.model.Category;

import java.util.List;

public interface CategoryDAO
{

	
	public boolean save(Category category);
	

	public boolean update(Category category);
	
	
	public boolean delete(Category category);
	
	public Category get(String id);
	
	public List<Category>  list();
	
}
