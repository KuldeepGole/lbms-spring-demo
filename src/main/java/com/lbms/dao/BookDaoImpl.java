package com.lbms.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lbms.dao.impl.BookDao;
import com.lbms.models.BookMaster;

@Repository("defaultBookDao")
public class BookDaoImpl implements BookDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveBook(BookMaster bookMaster) {
		this.sessionFactory.getCurrentSession().save(bookMaster);
	}
}
