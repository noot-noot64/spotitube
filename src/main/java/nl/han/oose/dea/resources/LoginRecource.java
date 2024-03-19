package nl.han.oose.dea.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nl.han.oose.dea.dto.LoginDTO;
import nl.han.oose.dea.dto.LoginDTOReponse;

@Path("/login")
public class LoginRecource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(LoginDTO loginDTO) {
        LoginDTOReponse loginDTOReponse = new LoginDTOReponse("1234-1234-1234", loginDTO.getUser());
        return Response.ok(loginDTOReponse).build();
    }
}
