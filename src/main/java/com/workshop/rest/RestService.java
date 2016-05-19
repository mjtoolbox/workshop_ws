package com.workshop.rest;

import com.workshop.utility.Utility;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/restservice")
public class RestService {

    @GET
    @Path("/{username}")
    @Produces("text/plain")
    public String getUsername(@PathParam("username") String aUserName) {
        return "Hello " + aUserName;
    }

    @GET
    @Path("/test")
    @Produces("text/plain")
    public String getTestMessage() {
        return Utility.loadProperties().getProperty("messageText");
    }

}
