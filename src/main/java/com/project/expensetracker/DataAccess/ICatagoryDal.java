package com.project.expensetracker.DataAccess;

import java.util.List;
import com.project.expensetracker.Entities.Catagories;


public interface ICatagoryDal {
	List<Catagories> getAll();
	void add(Catagories catagory);
	void update(Catagories catagory);
	void delete(Catagories catagory);
	Catagories getById(int id);
	Catagories getByName(String name);
}
