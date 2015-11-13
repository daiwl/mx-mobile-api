package com.magenta.maxoptra.mobile.api.remote;

import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIResponse;


public interface MobileIntegrationRemoteService {

    MobileAPIResponse pullMessage(MobileAPIRequest message);

}
