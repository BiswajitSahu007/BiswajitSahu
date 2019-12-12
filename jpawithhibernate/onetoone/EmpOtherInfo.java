package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empother_info")
public class EmpOtherInfo {
	@Id
	@Column
	private int id;
	@Column
	private String pan;
	@Column
	private String fathername;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmpInfo employee;
}
