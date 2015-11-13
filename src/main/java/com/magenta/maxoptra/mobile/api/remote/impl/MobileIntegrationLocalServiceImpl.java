package com.magenta.maxoptra.mobile.api.remote.impl;

import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIResponse;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationLocalService;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(MobileIntegrationLocalService.class)
public class MobileIntegrationLocalServiceImpl implements MobileIntegrationLocalService {

    @Override
    public void pushMessage(MobileAPIResponse response) {
        throw new UnsupportedOperationException();
    }
}
