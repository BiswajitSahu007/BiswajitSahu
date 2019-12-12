package com.capgemini.jpawithhibernate.manytoone;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmpInfo;

import lombok.Data;

@Data
@Entity
@Table(name="EmpExperience")

public class EmpExperience {
	@Id
	@Column
	private int expId;
	@Column
	private String cname;
	@Column
	private int noOfYear;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmpInfo emp;
	
}


