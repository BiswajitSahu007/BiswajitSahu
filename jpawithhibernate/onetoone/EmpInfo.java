package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="emp_info")
public class EmpInfo {
	@Id
	@Column
		
	private	int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
		@Exclude
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
	private EmpOtherInfo other;
}
