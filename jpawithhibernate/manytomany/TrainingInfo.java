package com.capgemini.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmpInfo;

import lombok.Data;

@Data
@Entity
@Table(name="TraingingInfo")
public class TrainingInfo {
	@Id
	@Column
	private int tId;
	@Column
	private String tName;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="training_employee",joinColumns = @JoinColumn(name="tid"),inverseJoinColumns = @JoinColumn(name="eid"))
														//training_employee is the mediator table betwwn emp and training table
	
	private List<EmpInfo> eList;				//because list of employees are there
	
	
}
