package edu.badpals.gildedroseAPI;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class Resources {
    @Inject
    Services services;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("welcome")
    public String welcomeHandler() {
        return "Welcome to the shop!";
    }
}
