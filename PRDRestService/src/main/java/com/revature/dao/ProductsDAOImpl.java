package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.domain.Products;
//import com.revature.util.ConnFactory;

public class ProductsDAOImpl {
	
	private static int count = 4;

	public static List<Products> prdList = new ArrayList<>();
	// public static ConnFactory cf = ConnFactory.getInstance();

	/*
	 * @author Tiffany Tran
	 * @author Nathaniel Simpson
	 * ID - int, primary key Name - String Code Name - String,
	 * unique Department - String PRDType - String (Full/Expedited) ProductType -
	 * String (Physical/Process) Description - String isPrototype - boolean
	 */
	static {
		prdList.add(new Products(001, "Bert's Bears Shaving Cream", "BBSC", "Toiletries", "Full", "Physical",
				"A shaving cream for bears.", false));
		prdList.add(new Products(002, "Broken Biscuits Body Wash", "BBBW", "Soap", "Full", "Physical",
				"A body wash for hearty men and breakfast.", false));
		prdList.add(new Products(003, "Full Hydrogenation Manufacturing", "FHM", "Manufacturing", "Full", "Process",
				"A new manufacturing process.", false));
		prdList.add(new Products(004, "New Spice Fuji", "NSF", "Soap", "Full", "Physical", "That fresh volcano sent.",
				true));
	}

	public static List<Products> getAllProducts() {
		return prdList;
	}

	public static Products getInfoByType(String type) {
		for (Products p : prdList) {
			if (p.getPrdType() == type) {
				return p;
			}
		}
		return null;
	}

	public static Products getInfoByCdName(String name) {
		for (Products p : prdList) {
			if (p.getPrdCdName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public static void addProduct(Products p) {
		if (isUniqueCodeName(p.getPrdCdName())) {
			p.setPrdID(incrementId());
			prdList.add(p);
		}
	}
	
//	public static void updateProduct(Products p) {
//		for (Products prd : prdList) {
//			if (p.getPrdCdName() == prd.getPrdCdName()) {
//				p.setPrdID(prd.getPrdID());
//				prdList.set(p.getPrdID() - 1, p);
//				break;
//			}
//		}
//	}

	// removing by codename
	public static void removeProduct(String name) {
		for (int i = 0; i < prdList.size(); i++) {
			if (prdList.get(i).getPrdCdName() == name) {
				prdList.remove(name);
			}
		}
	}
	
	public static int incrementId() {
		count++;
		return count;
	}
	
	public static boolean isUniqueCodeName(String s) {
		for (Products p : prdList) {
			if (p.getPrdCdName().equals(s)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void resetPrdList() {
		prdList = new ArrayList<>();
		prdList.add(new Products(001, "Bert's Bears Shaving Cream", "BBSC", "Toiletries", "Full", "Physical",
				"A shaving cream for bears.", false));
		prdList.add(new Products(002, "Broken Biscuits Body Wash", "BJBW", "Soap", "Full", "Physical",
				"A body wash for hearty men and breakfast.", false));
		prdList.add(new Products(003, "Full Hydrogenation Manufacturing", "FHM", "Manufacturing", "Full", "Process",
				"A new manufacturing process.", false));
		prdList.add(new Products(004, "New Spice Fuji", "NSF", "Soap", "Full", "Physical", "That fresh volcano sent.",
				true));
	}

}