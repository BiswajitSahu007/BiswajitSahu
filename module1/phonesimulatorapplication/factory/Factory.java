package com.capgemini.phonesimulatorapplication.factory;

import com.capgemini.phonesimulatorapplication.dao.ContactDao;
import com.capgemini.phonesimulatorapplication.dao.ContactDaoImpl;

public class Factory {
	public static ContactDao objectContactDaoImpl() {
		ContactDao dao= new ContactDaoImpl();
		return dao;
	}
}
