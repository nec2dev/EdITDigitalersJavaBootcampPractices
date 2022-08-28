package com.javacodegeeks.enterprise.rest.jersey.jerseyclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class JerseyClient4 {

	public static void main(String[] args) {
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(
					JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
			Client client = Client.create(clientConfig);

			WebResource webResource = client
					.resource("http://localhost:8080/JerseyJSONExample/rest/jsonServices/edad/19");

			Boolean respuesta = webResource.accept("application/json").type("application/json").get(Boolean.class);
			System.out.println(respuesta.booleanValue());
			
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
