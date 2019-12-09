package com.capg.map.hashmap;

public class Student {
	int studid;
	String studname;
	public Student(int studid, String studname) {
		super();
		this.studid = studid;
		this.studname = studname;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studid;
		result = prime * result + ((studname == null) ? 0 : studname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studid != other.studid)
			return false;
		if (studname == null) {
			if (other.studname != null)
				return false;
		} else if (!studname.equals(other.studname))
			return false;
		return true;
	}
	
}
