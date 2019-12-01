package com.lbms.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lbms.dao.BookDao;
import com.lbms.models.BookMaster;
import com.lbms.services.BookService;

@Service("defaultBookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public void saveBook(BookMaster bookMaster) {
		// TODO Auto-generated method stub
		bookDao.saveBook(bookMaster);
	}

}
