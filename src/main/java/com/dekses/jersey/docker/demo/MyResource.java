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
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getIt() {
        System.out.println("GET");
        return new Patient("A", "B", 0, "dasdfasdf");
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON})
    public Patient addEmployee(Patient emp) {   
        
        System.out.println("POST");
        MongoDB db = new MongoDB();
        System.out.print(emp.getNombre());
        db.AddPatient("Jaun","8", 123, "Publico");
        
        return new Patient();
    }
    
    
    
    
}
