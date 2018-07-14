package com.revature.beans;

public class Product {
	
	private int pid;
	private String pFName;
	private String pShortName;
	private String pDept;
	private String pType;
	private String pDesc;
	
	public Product() {
		super();
	}
	
	public Product(int pid, String pFName, String pShortName, String pDept, String pType, String pDesc) {
		super();
		this.pid = pid;
		this.pFName = pFName;
		this.pShortName = pShortName;
		this.pDept = pDept;
		this.pType = pType;
		this.pDesc = pDesc;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpFName() {
		return pFName;
	}

	public void setpFName(String pFName) {
		this.pFName = pFName;
	}

	public String getpShortName() {
		return pShortName;
	}

	public void setpShortName(String pShortName) {
		this.pShortName = pShortName;
	}

	public String getpDept() {
		return pDept;
	}

	public void setpDept(String pDept) {
		this.pDept = pDept;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pFName=" + pFName + ", pShortName=" + pShortName + ", pDept=" + pDept
				+ ", pType=" + pType + ", pDesc=" + pDesc + "]";
	}

}
