package com.revature.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.revature.dao.ProductsDAOImpl;
import com.revature.domain.Products;

/**
 * 
 * @author Nathaniel Simpson
 * @author Tiffany Tran
 *
 */
@Path(value = "products")
public class PRDService {

	@GET
	@Path("/")
	@Produces(value = { "application/json", "application/xml" })
	public Response getProducts() {
		ArrayList<Products> z = (ArrayList<Products>) ProductsDAOImpl.getAllProducts();
		return Response.status(Response.Status.OK).entity(z).build();
	}

	@GET
	@Path("/{product}")
	@Produces(value = { "application/json", "application/xml" })
	public Response getProduct(@PathParam("product") String product) {
		Products p = ProductsDAOImpl.getInfoByCdName(product);
		return Response.status(Response.Status.OK).entity(p).build();
	}
	
	@GET
	@Path("/codename")
	@Produces(value = { "application/json", "application/xml" })
	public Response getCdNames() {
		List<String> l = ProductsDAOImpl.getAllCdNames();
		return Response.status(Response.Status.OK).entity(l).build();
	}

	@POST
	@Path("/")
	@Produces(value = { "application/json", "application/xml" })
	public Response createProduct(Products p) {
		//if (ProductsDAOImpl.isUniqueCodeName(p.getPrdCdName())) {
		ProductsDAOImpl.addProduct(p);
		if (ProductsDAOImpl.getAllProducts().contains(p)) {
			return Response.status(Response.Status.OK).entity("Product " + p.getPrdName() + " was added successfully!!").build();
		}
		//}
		//		else {
		//			ProductsDAOImpl.updateProduct(p);
		//			if (ProductsDAOImpl.getAllProducts().contains(p)) {
		//				return Response.status(Response.Status.OK).entity("Product " + p.getPrdName() + " was successfully updated!").build();
		//			}
		//		}

		return Response.status(Response.Status.OK).entity("Product already exists in database.").build();
	}
	
	

}
