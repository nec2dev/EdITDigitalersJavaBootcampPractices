package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jsonServices")
public class JerseyRestService {

	@GET
	@Path("/print/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona produceJSON( @PathParam("name") String name ) {
		Persona st = new Persona(name, "Diaz",22,1);
		return st;
	}
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON( Persona persona ) {
		return Response.status(200).entity(persona.toString()).build();
	}
	
	@GET
	@Path("/edad/{edad}")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean sosMayorDeEdad(@PathParam("edad") Integer edad) {
	      return edad >= 18;
	   } 



}
