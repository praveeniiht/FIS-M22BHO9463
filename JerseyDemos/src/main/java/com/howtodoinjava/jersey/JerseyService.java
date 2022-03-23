package com.howtodoinjava.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employee")
public class JerseyService
{
    @GET
    @Path("/test1")
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
    
    @GET
    @Path("/all")
    
   @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	List<Employee> emps = service.displayAll();
    	GenericEntity<List<Employee>> data = new GenericEntity<List<Employee>>(emps) {};
    	return Response.status(200).entity(data.getEntity()).build();
    }
    
    
    @POST
    @Path("/add/{id}/{name}")
   // @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertEmp(@PathParam("id") int id, @PathParam("name") String name)
    {
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	return Response.status(200).entity(service.insertEmployee(new Employee(id,name))).build();
    }
    
    
    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEmp(@PathParam("id") int id) {
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	return Response.accepted().entity(service.deleteEmployee(id)).build();
    }
    
    @PUT
    @Path("/update/{id}/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEmp(@PathParam("id") int id, @PathParam("name") String name)
    {
    	EmployeeServiceImpl service = new EmployeeServiceImpl();
    	return Response.status(200).entity(service.updateEmployee(new Employee(id,name))).build();
    }
    
    
}
