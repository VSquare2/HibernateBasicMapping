package com.hib;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class StudentHib {
	
	

	@Id
	private int sid;
	private String sname;
	private int marks;
	
//	@OneToOne
//	private Laptop laptop;
//	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
	
//	@OneToMany(mappedBy="stud")
//	private List<Laptop> laptopList = new ArrayList<Laptop>();
//	
//	
//	
//	public List<Laptop> getLaptopList() {
//		return laptopList;
//	}
//	public void setLaptopList(List<Laptop> laptopList) {
//		this.laptopList = laptopList;
//	}
	
	
	@ManyToMany(mappedBy = "studs")
	private List<Laptop> laplist = new ArrayList<Laptop>();
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public List<Laptop> getLaplist() {
		return laplist;
	}
	public void setLaplist(List<Laptop> laplist) {
		this.laplist = laplist;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
}
