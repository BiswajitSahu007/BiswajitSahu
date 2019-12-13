package com.capgemini.phonesimulatorapplication.dao;

import java.util.List;

import com.capgemini.phonesitmulatorapplication.bean.ContactBean;

public interface ContactDao {

		public List<ContactBean> viewAllContacts();

		public	ContactBean viewContact(String name); 

		public boolean insertContact(ContactBean con);

		public boolean deleteContact(String name);

		public boolean updateContact(String name,String number);




}
