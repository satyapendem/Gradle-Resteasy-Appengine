package com.gradleresteasy.controller;

import javax.jdo.annotations.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by valishah on 5/16/17.
 */
@Path("/api/v1")
public class SampleController {


    @GET
    @Path("/hello")
    public Response sayHello(@QueryParam("name") String name){
        return Response.status(200).entity("Hello "+(name!=null?name:"World")+"!").build();
    }
}
