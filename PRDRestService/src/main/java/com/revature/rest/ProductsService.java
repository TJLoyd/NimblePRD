package com.revature.rest;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.revature.daoimpl.ProductDAOImpl;
import com.revature.domain.Products;

@Path(value="products")
public class ProductsService {

	@GET
	@Path("/{product}")
	@Produces(value= {"application/json", "application/xml"})
	public Response getProduct(@PathParam("product") String shortName) throws SQLException {
		ProductDAOImpl pdi = new ProductDAOImpl();
		Products p = pdi.retrieveProduct(shortName);
		return Response.status(Response.Status.OK).entity(p).build();
	}
	
	@POST
	@Path("/")
	@Produces(value= {"application/json", "application/xml"})
	public Response createProduct(Products p) throws SQLException {
		ProductDAOImpl pdi = new ProductDAOImpl();
		pdi.createProduct(p.getfName(), p.getShortName(), p.getDept(), p.getType(), p.getDesc());
		return Response.status(Response.Status.OK).entity("Product " + 
				" was added successfully.").build();
	}
	
}
