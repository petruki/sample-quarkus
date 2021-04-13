package com.github.petruki;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jose4j.json.internal.json_simple.JSONObject;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiResources {

    @GET
    @PermitAll
    @Path("/check")
    public Response check() {
    	Map<String, String> result = new HashMap<>();
    	result.put("result", "All good");
        return Response.ok(JSONObject.toJSONString(result)).build();
    }
    
}