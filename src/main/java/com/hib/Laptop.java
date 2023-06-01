package com.hib;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	
//	@ManyToOne
//	private StudentHib stud;
	
	@ManyToMany
	private List<StudentHib> studs= new ArrayList<StudentHib>();

	
	public List<StudentHib> getStuds() {
		return studs;
	}
	public void setStuds(List<StudentHib> studs) {
		this.studs = studs;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
