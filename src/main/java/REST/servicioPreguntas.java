/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package REST;

import DAO.preguntaDAO;
import DTO.Pregunta;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
//import org.o7planning.restfulcrud.dao.EmployeeDAO;
//import org.o7planning.restfulcrud.model.Employee;
 
@Path("/preguntas")
public class servicioPreguntas {
 
    // URI:
    // /contextPath/servletPath/preguntas
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Pregunta> getPreguntas_JSON() {
        List<Pregunta> listaPreguntas = preguntaDAO.getAllPreguntas();
        return listaPreguntas;
    }
 
    // URI:
    // /contextPath/servletPath/preguntas/{empNo}
    @GET
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Pregunta getPregunta(@PathParam("empNo") String empNo) {
        return preguntaDAO.getPregunta(Integer.parseInt(empNo));
    }
 
    // URI:
    // /contextPath/servletPath/preguntas
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Pregunta addPregunta(Pregunta emp) {
        return preguntaDAO.addPregunta(emp);
    }
 
    // URI:
    // /contextPath/servletPath/preguntas
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Pregunta updatePregunta(Pregunta emp) {
        return preguntaDAO.updatePregunta(emp);
    }
 
    @DELETE
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEmployee(@PathParam("empNo") String empNo) {
        preguntaDAO.deletePregunta(Integer.parseInt(empNo));
    }
 
}