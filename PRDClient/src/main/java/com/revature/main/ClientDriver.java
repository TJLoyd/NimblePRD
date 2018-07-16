package com.revature.main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.revature.domain.Products;

public class ClientDriver {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/PRDRestService/rest/products");
		
		Builder postProductBuilder = webTarget.request();
		Products p = new Products(1, "Kerbal Moon Lander", "Lander", "Space", "Rocket", "Lander for moon landing.");
		
		Response postProductResponse = 
				postProductBuilder.accept(MediaType.APPLICATION_JSON)
				.post(Entity.entity(p, MediaType.APPLICATION_JSON));
	}

}
