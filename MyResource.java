
package com.examples.jersey.jaxemployeecrud;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/employee")
public class MyResource {
    static List<Employee> emps;
	static {
		emps= new ArrayList();
		Employee e1 = new Employee(1001,"praveen","finance");
		Employee e2 = new Employee(1002,"kumar","operations");
		Employee e3 = new Employee(1003,"anil","testing");
		emps.add(e1); emps.add(e2); emps.add(e3);
	}
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all")
	public Response showAll() {
		Employee e1 = new Employee(1001,"praveen","finance");
		Employee e2 = new Employee(1002,"kumar","operations");
		Employee e3 = new Employee(1003,"anil","testing");
		emps.add(e1); emps.add(e2); emps.add(e3);
	
		return Response.status(200).entity(e1).build();
		
	}
	
	@Path("/test")
	@GET
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response test(Employee emp) {
		return Response.status(200).entity(emp).build();
	}
    
    @Path("/search/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Response searchEmp(@PathParam("id")int id) {
    	Employee temp=null;
    	for(Employee e: emps) {
    		if(e.getId()==id) {
    			temp=e;
    			break;
    		}
    	}
    	
    	if(temp==null)
    		return Response.status(200).entity("no data found").build();
    	else
    		return Response.status(200).entity(temp).build();
    }

}
