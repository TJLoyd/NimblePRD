package com.revature.domain;

public class Products {
	
	private int id;
	private String fName;
	private String shortName;
	private String dept;
	private String prdType;
	private String type;
	private String desc;
	private boolean isPrototype;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String fName, String shortName,
			String dept, String prdType, String type, String desc, boolean isPrototype) {
		super();
		this.id = id;
		this.fName = fName;
		this.shortName = shortName;
		this.dept = dept;
		this.prdType = prdType;
		this.type = type;
		this.desc = desc;
		this.isPrototype = isPrototype;
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

	public String getPrdType() {
		return prdType;
	}

	public void setPrdType(String prdType) {
		this.prdType = prdType;
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

	public boolean isPrototype() {
		return isPrototype;
	}

	public void setPrototype(boolean isPrototype) {
		this.isPrototype = isPrototype;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", fName=" + fName + ", shortName=" + shortName + ", dept=" + dept + ", prdType="
				+ prdType + ", type=" + type + ", desc=" + desc + ", isPrototype=" + isPrototype + "]";
	}

}
