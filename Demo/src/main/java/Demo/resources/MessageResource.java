package Demo.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Demo.message.Message;
import Demo.service.Service;

@Path("messages")
public class MessageResource {
	Service service = new Service();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return service.getAllMessage();
	}
	
	/*@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public Message getMessage(@PathParam("messageId") int id) {
		return service.getMessage(id);
	}*/
}
