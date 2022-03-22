package com.examples.jaxrs.jaxrsapp;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestResources {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testString() {
		return "Hi, test resource is responding";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String postString() {
		return "Hi, post method mapping is also working...";
	}

}
