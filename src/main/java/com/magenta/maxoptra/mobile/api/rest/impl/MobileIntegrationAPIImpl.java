package com.magenta.maxoptra.mobile.api.rest.impl;

import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIResponse;
import com.magenta.maxoptra.mobile.api.ns.mns1.*;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationLocalService;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationRemoteService;
import com.magenta.maxoptra.mobile.api.rest.MobileIntegrationAPI;
import com.magenta.maxoptra.mobile.api.utils.MarshallerHelper;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;

@Stateless
@Local(MobileIntegrationAPI.class)
public class MobileIntegrationAPIImpl implements MobileIntegrationAPI {

    private static final Class[] defaultClasses = new Class[]{
            MobileAPIRequest.class, MobileAPIResponse.class,
            AuthRequest.class, AuthResponse.class, ScheduleRequest.class, ScheduleResponse.class, DynamicAttribute.class,
            Route.class, Order.class, OrderItem.class, OrderState.class, Position.class};

    @EJB
    MobileIntegrationRemoteService remoteService;

    @EJB
    MobileIntegrationLocalService localService;

    @Override
    public void sync(HttpServletRequest request, HttpServletResponse response) {
        try {
            Object mobileAPIRequest = MarshallerHelper.unmarshal(request.getInputStream(), defaultClasses);
            MobileAPIResponse mobileAPIResponse = remoteService.pullMessage((MobileAPIRequest) mobileAPIRequest);
            MarshallerHelper.marshalToOS(mobileAPIResponse, response.getOutputStream(), defaultClasses);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
