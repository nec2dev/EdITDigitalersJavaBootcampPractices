package com.javacodegeeks.enterprise.rest.jersey.jerseyclient;

import com.javacodegeeks.enterprise.rest.jersey.Persona;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class JerseyClient3 {

	public static void main(String[] args) {
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(
					JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
			Client client = Client.create(clientConfig);

			WebResource webResource = client
					.resource("http://localhost:8080/JerseyJSONExample/rest/jsonServices/print/Juan");

			Persona persona = webResource.accept("application/json").type("application/json").get(Persona.class);
			System.out.println(persona.getNombre());
			
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
