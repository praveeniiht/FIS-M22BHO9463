package com.logicbig.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("orders")
public class OrderService {

    @GET
    @Path("{orderId:\\d{3,5}}")  // mmi 3 digit to max 5 digit
    public String getOrders(@PathParam("orderId") String orderId) {
        return "orderId: " + orderId;
    }

    @GET
    @Path("{orderId:[a-z]\\d{2,3}}")
    public String getOrders2(@PathParam("orderId") String orderId) {
        return "orderId: " + orderId;
    }
}