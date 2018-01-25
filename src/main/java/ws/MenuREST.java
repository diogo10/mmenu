package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/v1/menu")
public class MenuREST {

	@GET
	@Path("/get/{token}")
	@Produces("application/json")
	public Response getCliente(@PathParam("token") String token) {
		System.out.println(token);
		List<String> options = new ArrayList<String>();
		options.add("Dashboard");
		options.add("Orders");
		return Response.status(200).entity(new Gson().toJson(options)).build();
	}
}
