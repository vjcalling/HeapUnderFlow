package com.learning.cmad.user.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.learning.cmad.user.api.BlogUser;
import com.learning.cmad.user.api.User;
import com.learning.cmad.user.biz.SimpleBlogUser;

@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
@Path("/user")
public class UserRootResource {

	private BlogUser user = new SimpleBlogUser();
	
	@GET
    @Path("/")
	public Response getAllUsers() {
		List<User> users = user.getAllUsers();
		return Response.ok().entity(users).build();
	}
	
	
	@POST
    @Path("/signup")
	public Response signupUser(User newUser) throws URISyntaxException {
		user.createUser(newUser);
		return Response.created(new URI(newUser.getUserId() + "")).build();
	}
	
}
