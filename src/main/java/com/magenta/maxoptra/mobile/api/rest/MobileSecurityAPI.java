package com.magenta.maxoptra.mobile.api.rest;

import com.magenta.maxoptra.mobile.api.ns.mns0.AuthRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.AuthResponse;
import com.magenta.maxoptra.mobile.api.type.AuthStatus;
import com.magenta.maxoptra.mobile.api.utils.XSDSchemeGenerator;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import java.io.IOException;

@Path("security")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class MobileSecurityAPI {

    @POST
    @Path("/auth")
    public AuthResponse auth(AuthRequest requestRecord) throws JAXBException, IOException {
//        XSDSchemeGenerator.authRequestXSD();
        XSDSchemeGenerator.authResponseXSD();
        return new AuthResponse("sessID", AuthStatus.OK);
    }

}
