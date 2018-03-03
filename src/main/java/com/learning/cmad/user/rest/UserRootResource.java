package com.learning.cmad.user.rest;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

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
import com.learning.cmad.utils.JWTTokenHelper;
import javax.ws.rs.HeaderParam;



@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
@Path("/user")
public class UserRootResource {

	private BlogUser user = new SimpleBlogUser();
	private JWTTokenHelper jwtTokenHelper = new JWTTokenHelper();
	
	@GET
    @Path("/")
	public Response getAllUsers() {
		List<User> users = user.getAllUsers();
		return Response.ok().header("Access-Control-Allow-Origin", "*").entity(users).build();
	}
	
	
	@POST
    @Path("/signup")
	public Response signupUser(User newUser) throws URISyntaxException {
		user.createUser(newUser);
		String token = jwtTokenHelper.createJWT(UUID.randomUUID().toString(), newUser.getUsername(), "sample subject", 15000);
		return Response.ok(token).build();
		//return Response.created(new URI(newUser.getUserId() + "")).build();
	}
	
	@POST
    @Path("/login")
	public Response loginUser(User loginUser, @HeaderParam("token") String token) {
		user.createUser(loginUser);
		System.out.println("Token is: "+token);
		String token1 = jwtTokenHelper.createJWT(UUID.randomUUID().toString(), loginUser.getUsername(), "sample subject", 15000);
		return Response.ok(token1).build();

		
	}
	
}
