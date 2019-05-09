package com.dekses.jersey.docker.demo;

import com.dekses.jersey.docker.demo.dao.MongoDB;
import com.dekses.jersey.docker.demo.model.Patient;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        System.out.println("GET");
        return "Got it!";
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Patient addEmployee(Patient emp) {   
        System.out.println("POST");
        MongoDB db = new MongoDB();
        System.out.print(emp.getNombre());
        db.AddPatient(emp.getNombre(),emp.getDireccion(), emp.getTelefono(), emp.getPublico());
        return new Patient();
    }
}
