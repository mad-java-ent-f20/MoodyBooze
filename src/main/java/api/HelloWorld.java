package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{param}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces({"text/plain", "text/html", "application/json"})
    public Response getMessage(@PathParam("param") String msg) {
        // Return a simple message
        String outputString = "Hello: "+ msg;
        String outputHtml = "<br><html><body><h1>Hello: "+ msg + "</h1></body></html>";
        String outputJason = "{\"Hello\":\"" + msg + "\"}";
        return Response.status(200).entity(outputString + outputHtml + outputJason).build();


    }
}
