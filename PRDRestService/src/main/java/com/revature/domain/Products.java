package com.revature.domain;

/*
 * @author Tiffany Tran
 * @author Nathaniel Simpson
 * ID - int, primary key
Name - String
Code Name - String, unique
Department - String
PRDType - String (Full/Expedited)
ProductType - String (Physical/Process)
Description - String
isPrototype - boolean*/
public class Products {

	int prdID;
	String prdName;
	String prdCdName;
	String prdOwner;
	String prdType;
	String productType;
	String prdDesc;
	boolean isPrototype;

	public Products() {
		super();
	}

	public Products(int prdID, String prdName, String prdCdName, String prdOwner, String prdType, String productType,
			String prdDesc, boolean isPrototype) {
		super();
		this.prdID = prdID;
		this.prdName = prdName;
		this.prdCdName = prdCdName;
		this.prdOwner = prdOwner;
		this.prdType = prdType;
		this.productType = productType;
		this.prdDesc = prdDesc;
		this.isPrototype = isPrototype;
	}

	public int getPrdID() {
		return prdID;
	}

	public void setPrdID(int prdID) {
		this.prdID = prdID;
	}

	public String getPrdCdName() {
		return prdCdName;
	}

	public void setPrdCdName(String prdCdName) {
		this.prdCdName = prdCdName;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdOwner() {
		return prdOwner;
	}

	public void setPrdOwner(String prdOwner) {
		this.prdOwner = prdOwner;
	}

	public String getPrdType() {
		return prdType;
	}

	public void setPrdType(String prdType) {
		this.prdType = prdType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPrdDesc() {
		return prdDesc;
	}

	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}

	public boolean isPrototype() {
		return isPrototype;
	}

	public void setPrototype(boolean isPrototype) {
		this.isPrototype = isPrototype;
	}

	@Override
	public String toString() {
		return "Products [prdID=" + prdID + ", prdName=" + prdName + ", prdCdName=" + prdCdName + ", prdOwner="
				+ prdOwner + ", prdType=" + prdType + ", productType=" + productType + ", prdDesc=" + prdDesc
				+ ", isPrototype=" + isPrototype + "]";
	}

}
