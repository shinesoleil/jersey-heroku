package com.example.myproject;

import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloResource {

    @GET
    @Path("en")
    @Produces(MediaType.TEXT_PLAIN)
    public String englishHello() {
        Logger.getLogger(getClass()).info("Working???");
        return "hello";
    }

    @GET
    @Path("fr")
    @Produces(MediaType.TEXT_PLAIN)
    public String frenchHello() {
        Logger.getLogger(getClass()).info("Working???");
        return "bonjour";
    }



}