package com.project.expensetracker.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import com.project.expensetracker.Entities.Catagories;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Repository
public class HibernateCatagoryDal implements ICatagoryDal{
	private EntityManager entityManager;

	@Override
	public List<Catagories> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Catagories> catagories = session.createQuery("from catagory",Catagories.class).getResultList();
		return catagories;
	}

	@Override
	public void add(Catagories catagory) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(catagory);	
	}

	@Override
	public void update(Catagories catagory) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(catagory);
		
	}

	@Override
	public void delete(Catagories catagory) {
		Session session = entityManager.unwrap(Session.class);
		session.remove(catagory);
		
	}

	@Override
	public Catagories getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Catagories catagory = session.get(Catagories.class,id);
		return catagory;
	}

	@Override
	public Catagories getByName(String name) {
		Session session = entityManager.unwrap(Session.class);
		Catagories catagory = session.get(Catagories.class,name);
		return catagory;
	}
	
}
