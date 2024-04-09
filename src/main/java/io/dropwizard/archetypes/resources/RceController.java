package io.dropwizard.archetypes.resources;


import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RceController {
    @POST
    public String rceFucntioncall(@Valid Employee emp)
    {
        return "Anything";
    }
}
