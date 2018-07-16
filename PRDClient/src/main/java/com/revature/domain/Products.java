package com.revature.domain;

public class Products {
	
	private int id;
	private String fName;
	private String shortName;
	private String dept;
	private String type;
	private String desc;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String fName, String shortName, String dept, String type, String desc) {
		super();
		this.id = id;
		this.fName = fName;
		this.shortName = shortName;
		this.dept = dept;
		this.type = type;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", fName=" + fName + ", shortName=" + shortName + ", dept=" + dept + ", type="
				+ type + ", desc=" + desc + "]";
	}

}
