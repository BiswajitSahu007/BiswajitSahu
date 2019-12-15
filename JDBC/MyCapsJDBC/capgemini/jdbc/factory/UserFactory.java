package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOimpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImpl;

public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDAO instanceOfDAOimpl() {
		UserDAO dao=new UserDAOimpl();
		return dao;
	}
	
	public static UserServices instanceOfUserServicesImpl() {
		UserServices services=new UserServicesImpl();
		return services;
	}
}
