package se.havochvatten.unionvms.rest;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/settings")
public class ChangeServerSettings extends HttpServlet {

    @GET
    @Path("/nthposition/{valueOfN}")
    @Produces("text/html")
    public String setNthPosition(@PathParam("valueOfN")int nValue) {
        return "<html lang=\"en\"><body><h1>SetNthPosition is still under construction!! [new value=" + nValue + "]</h1></body></html>";
    }
}
