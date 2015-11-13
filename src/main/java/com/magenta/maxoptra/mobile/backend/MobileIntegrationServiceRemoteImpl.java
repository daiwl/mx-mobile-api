package com.magenta.maxoptra.mobile.backend;

import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIResponse;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationRemoteService;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(MobileIntegrationRemoteService.class)
public class MobileIntegrationServiceRemoteImpl implements MobileIntegrationRemoteService {

    @Override
    public MobileAPIResponse pullMessage(MobileAPIRequest message) {
        return new MobileAPIResponse();
    }

}
