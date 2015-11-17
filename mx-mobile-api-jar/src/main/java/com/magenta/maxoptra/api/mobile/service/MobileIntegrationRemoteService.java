package com.magenta.maxoptra.api.mobile.service;


import com.magenta.maxoptra.api.mobile.node.mns0.MobileAPIRequest;
import com.magenta.maxoptra.api.mobile.node.mns0.MobileAPIResponse;

public interface MobileIntegrationRemoteService {

    MobileAPIResponse pullMessage(MobileAPIRequest message);

}
