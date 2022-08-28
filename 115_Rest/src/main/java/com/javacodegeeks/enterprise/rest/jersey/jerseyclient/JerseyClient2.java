package com.javacodegeeks.enterprise.rest.jersey.jerseyclient;

import org.codehaus.jettison.json.JSONObject;

import com.javacodegeeks.enterprise.rest.jersey.Persona;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class JerseyClient2 {

	public static void main(String[] args) {
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(
					JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client
					.resource("http://localhost:8080/JerseyJSONExample/rest/jsonServices/print/Pepito");
			
			String respuesta = webResource.accept("application/json").type("application/json").get(String.class);
			System.out.println("Respuesta original en JSON: " + respuesta);
			
			// comienzo a parsear
			JSONObject json = new JSONObject(respuesta);
			System.out.println(json.getString("nombre"));
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
